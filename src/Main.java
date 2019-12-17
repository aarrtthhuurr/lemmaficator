import grammar.tal_sqlLexer;
import grammar.tal_sqlParser;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    private static Properties properties = new Properties();
    private static final int MINIMUM_TOKEN_LENGTH = 4;

    private static StringTokenizer read() {
        BufferedReader bufferedReader;
        String prompt;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("> ");
            prompt = bufferedReader.readLine();
            return new StringTokenizer(prompt);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String choseToken(List<String> tokens) {
        if (tokens.size() == 1) return tokens.get(0);

        System.out.println(">> Chose between:");
        for (int i = 0; i < tokens.size(); i++) {
            System.out.println(">> ["+ i +"] " + tokens.get(i));
        }

        BufferedReader bufferedReader;
        String prompt;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(">> ");
            prompt = bufferedReader.readLine();
            return tokens.get(Integer.parseInt(prompt));
        }
        catch (NumberFormatException | IndexOutOfBoundsException e) {
            return choseToken(tokens);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> lemmifier(LemmasLexicon lemmasLexicon, List<String> tokens) {
        return tokens.stream()
                .map(token -> token.toLowerCase().trim())
                .filter(token -> token.length() >= MINIMUM_TOKEN_LENGTH)
                .map(token -> {
                    if ((token.matches("\\d+")))
                        return token;

                    String lemma;
                    if ((lemma = lemmasLexicon.getLemma(token)) != null) {
                        return lemma;
                    }

                    List<String> proximityCandidatesLemmas;
                    if (!(proximityCandidatesLemmas = new ProximityLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
                        return choseToken(proximityCandidatesLemmas);
                    }

                    List<String> levensheinCandidatesLemmas;
                    if (!(levensheinCandidatesLemmas = new LevenshteinLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
                        return choseToken(levensheinCandidatesLemmas);
                    }

                    return null; // TODO: Actually, we returns null. It could also be the token itself.
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public static String toSQL(String substituedRequest) throws IOException {
        try {
            tal_sqlLexer talSqlLexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(substituedRequest)));
            CommonTokenStream commonTokenStream = new CommonTokenStream(talSqlLexer);
            tal_sqlParser talSqlParser = new tal_sqlParser(commonTokenStream);

            String unformattedSqlRequest = talSqlParser.listerequetes()
                    .replaceAll("[()]", "")
                    .replaceAll("\\s+", " ")
                    .replaceAll("\\{(.*)\\}", "($1)");

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
        } catch (RecognitionException e) {
            throw new IOException(e);
        }
    }

    public static void main(String[] args) {
        try (InputStream configFile = new FileInputStream("config.properties")) {
            properties.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FilterList filterList = new FilterList(args[2]);
        SubstitutionLexicon substitutionLexicon = new SubstitutionLexicon(args[1]);
        LemmasLexicon lemmasLexicon = new LemmasLexicon(args[0], substitutionLexicon.getMap());
        SQLManager sqlManager = new SQLManager(
                properties.getProperty("psqlUrl"),
                properties.getProperty("psqlUsername"),
                properties.getProperty("psqlPassword"),
                properties.getProperty("psqlDatabase")
        );

        StringTokenizer tokens;

        while ((tokens = read()) != null) {
            if (!tokens.hasMoreTokens()) continue;

            List<String> tokensList = Collections.list(tokens).stream()
                    .map(token -> ((String) token).trim()
                            .toLowerCase()
                            .replaceAll(".*'(.*)", "$1")) // Keep only after "'"
                    .filter(token -> !token.matches("[^a-zA-Z\\d-_]"))
                    .collect(Collectors.toList());
            System.out.println("> Initial request: " + tokensList);

            List<String> filteredList = filterList.removeFrom(tokensList);
            System.out.println("> After filter: " + filteredList);

            List<String> lemmifiedList = lemmifier(lemmasLexicon, filteredList);
            System.out.println("> After lemmafication: " + lemmifiedList);

            List<String> replacedTokenList = substitutionLexicon.replaceAll(lemmifiedList);
            System.out.println("> After substitutions: " + replacedTokenList);

            try {
                String sqlRequest = toSQL(String.join(" ", replacedTokenList));
                System.out.println("> After SQLization: " + sqlRequest);

                if (!sqlRequest.isEmpty()) {
                    List<String> rows = sqlManager.request(sqlRequest);

                    if (!rows.isEmpty()) {
                        System.out.println("> SQL rows : ");
                        rows.forEach(System.out::println);
                    } else {
                        System.err.println("> 0 row found");
                    }
                } else {
                    System.err.println("> No SQL request found");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
