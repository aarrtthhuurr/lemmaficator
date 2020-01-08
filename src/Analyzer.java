import grammar.fichierLexer;
import grammar.fichierParser;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Analyzer {
    private final SQLManager sqlManager;
    private final SubstitutionLexicon substitutionLexicon;
    private final LemmasLexicon lemmasLexicon;
    private final FilterList filterList;
    private boolean choseInConsole = false;

    private static final int MINIMUM_TOKEN_LENGTH = 4;

    public Analyzer(SQLManager sqlManager, String wordsByLemmaPath, String structurePath, String stopListPath) {
        this.sqlManager = sqlManager;
        this.substitutionLexicon = new SubstitutionLexicon(structurePath);
        this.lemmasLexicon = new LemmasLexicon(wordsByLemmaPath, substitutionLexicon.getMap());
        this.filterList = new FilterList(stopListPath);
    }

    public void setChoseInConsole(boolean choseInConsole) {
        this.choseInConsole = choseInConsole;
    }

    public Response run(String request) {
        StringTokenizer tokens = new StringTokenizer(request);

        if (!tokens.hasMoreTokens()) return null;

        List<String> tokensAfterSmallCorrections = Collections.list(tokens).stream()
                .map(token -> ((String) token).trim()
                        .toLowerCase()
                        .replaceAll(".*'(.*)", "$1")) // Keep only after "'"
                .filter(token -> !token.matches("[^a-zA-Z\\d-_]"))
                .collect(Collectors.toList());

        List<String> tokensAfterStopList = filterList.removeFrom(tokensAfterSmallCorrections);

        List<Lemma> tokensAsLemmas = lemmafiyAll(lemmasLexicon, tokensAfterStopList, choseInConsole);

        for (Lemma lemma : tokensAsLemmas) {
            if (lemma.hasConflict()) {
                Response response = new Response(lemma);
                response.addMetadata("tokensAfterSmallCorrections", tokensAfterSmallCorrections);
                response.addMetadata("tokensAfterStopList", tokensAfterStopList);
                return response;
            }
        }

        List<String> tokensAsLemmasValues = tokensAsLemmas.stream().map(Lemma::getValue).collect(Collectors.toList());

        Response response;
        String unformattedSQLRequest = null;
        String cleanedSQLRequest = null;
        String sqlRequest = null;

        List<String> replacedTokenList = substitutionLexicon.replaceAll(tokensAsLemmasValues);

        try {
            unformattedSQLRequest = toPreSQL(String.join(" ", replacedTokenList));
            cleanedSQLRequest = unformattedSQLRequest
                    .replaceAll("[()]", "")
                    .replaceAll("\\s+", " ")
                    .replaceAll("\\{(.*)\\}", "($1)");
            sqlRequest = toSQL(cleanedSQLRequest);

            response = new Response(sqlManager.request(sqlRequest));
            response.addMetadata("unformattedSQLRequest", unformattedSQLRequest);
            response.addMetadata("cleanedSQLRequest", cleanedSQLRequest);
            response.addMetadata("finalSQLRequest", sqlRequest);
        } catch (IOException e) {
            e.printStackTrace();
            response = new Response(new ArrayList<>());
        }

        response.addMetadata("tokensAfterSmallCorrections", tokensAfterSmallCorrections);
        response.addMetadata("tokensAfterStopList", tokensAfterStopList);
        response.addMetadata("tokensAsLemmas", tokensAsLemmasValues);
        response.addMetadata("tokensAfterReplacements", replacedTokenList);

        return response;
    }

    private static Lemma choseValue(Lemma lemma) {
        if (!lemma.hasConflict()) return lemma;

        System.out.println(">> Chose between:");
        for (int i = 0; i < lemma.getChoices().size(); i++) {
            System.out.println(">> ["+ i +"] " + lemma.getChoices().get(i));
        }

        BufferedReader bufferedReader;
        String prompt;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(">> ");
            prompt = bufferedReader.readLine();
            return new Lemma(lemma.getToken(), lemma.getChoices().get(Integer.parseInt(prompt)));
        }
        catch (NumberFormatException | IndexOutOfBoundsException e) {
            return choseValue(lemma);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Lemma lemmafy(LemmasLexicon lemmasLexicon, String token, boolean choseInConsole) {
        String lemma;
        if ((lemma = lemmasLexicon.getLemma(token)) != null) {
            return new Lemma(token, lemma);
        }

        List<String> proximityCandidatesLemmas;
        if (!(proximityCandidatesLemmas = new ProximityLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
            Lemma conflictLemma = new Lemma(token, proximityCandidatesLemmas);
            return choseInConsole ? choseValue(conflictLemma) : conflictLemma;
        }

        List<String> levensheinCandidatesLemmas;
        if (!(levensheinCandidatesLemmas = new LevenshteinLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
            Lemma conflictLemma = new Lemma(token, levensheinCandidatesLemmas);
            return choseInConsole ? choseValue(conflictLemma) : conflictLemma;
        }

        return null; // TODO: Actually, we returns null. It could also be the token itself.
    }

    private static List<Lemma> lemmafiyAll(LemmasLexicon lemmasLexicon, List<String> tokens, boolean choseInConsole) {
        return tokens.stream()
                .map(token -> token.toLowerCase().trim())
                .filter(token -> token.length() >= MINIMUM_TOKEN_LENGTH || token.matches("\\d+"))
                .map(token -> {
                    if ((token.matches("\\d+")))
                        return new Lemma(token, token);

                    return lemmafy(lemmasLexicon, token, choseInConsole);
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private static String toPreSQL(String substituedRequest) throws IOException {
        try {
            fichierLexer talSqlLexer = new fichierLexer(new ANTLRReaderStream(new StringReader(substituedRequest)));
            CommonTokenStream commonTokenStream = new CommonTokenStream(talSqlLexer);
            fichierParser talSqlParser = new fichierParser(commonTokenStream);
            return talSqlParser.listerequetes();
        } catch (RecognitionException e) {
            throw new IOException(e);
        }
    }

    private static String toSQL(String unformattedSqlRequest) {
        Matcher select = Pattern.compile("^(.*?) FROM.*$", Pattern.CASE_INSENSITIVE).matcher(unformattedSqlRequest);
        Matcher from = Pattern.compile("FROM (.*?)(?= FROM| WHERE|$)", Pattern.CASE_INSENSITIVE).matcher(unformattedSqlRequest);
        Matcher where = Pattern.compile("WHERE (.*?)(?= FROM| WHERE|$)", Pattern.CASE_INSENSITIVE).matcher(unformattedSqlRequest);

        StringBuilder sqlRequestBuilder = new StringBuilder();

        while (select.find())
            sqlRequestBuilder.append(select.group(1).trim());

        boolean firstFrom = true;
        while (from.find()) {
            sqlRequestBuilder.append(firstFrom ? " FROM " : ", ").append(from.group(1).trim());
            firstFrom = false;
        }

        boolean firstWhere = true;
        while (where.find()) {
            sqlRequestBuilder.append(firstWhere ? " WHERE " : " OR ").append(where.group(1).trim());
            firstWhere = false;
        }

        return sqlRequestBuilder.toString();
    }
}
