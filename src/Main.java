import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    private static final int MINIMUM_TOKEN_LENGTH = 4;

    private static StringTokenizer read() {
        BufferedReader bufferedReader;
        String prompt;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(">");
            prompt = bufferedReader.readLine();
            return new StringTokenizer(prompt);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void lemmifier(LemmasLexicon lemmasLexicon, List<String> tokens) {
        if (tokens == null) return;

        tokens.forEach(token -> {
            String lemma;
            List<String> proximityCandidatesLemmas;
            List<String> levensheinCandidatesLemmas;

            token = token.toLowerCase().trim();

            if (token.length() < MINIMUM_TOKEN_LENGTH) {
                return;
            }

            if ((lemma = lemmasLexicon.getLemma(token)) != null) {
                System.out.println("[" + token + "] => [" + lemma + "] (LemmasLexicon)");
                return;
            }

            if (!(proximityCandidatesLemmas = new ProximityLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
                System.out.println("[" + token + "] => " + proximityCandidatesLemmas.toString() + " (Proximity)");
                return;
            }

            if ((levensheinCandidatesLemmas = new LevenshteinLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
                System.out.println("[" + token + "] => []");
            } else {
                System.out.println("[" + token + "] => " + levensheinCandidatesLemmas.toString() + " (Levenshtein)");
            }
        });
    }

    public static void main(String[] args) {
        LemmasLexicon lemmasLexicon = new LemmasLexicon(args[0]);
        ReplacementLexicon replacementLexicon = new ReplacementLexicon(args[1]);

        StringTokenizer tokens;

        while ((tokens = read()) != null ) {
            List<String> tokensList = Collections.list(tokens).stream().map(token -> ((String) token)).collect(Collectors.toList());
            System.out.println("Tokenized request: " + tokensList);

            List<String> replacedTokenList = replacementLexicon.replaceAll(tokensList);
            System.out.println("Tokenized and replaced request: " + replacedTokenList);

            lemmifier(
                    lemmasLexicon,
                    replacedTokenList
            );
        }
    }
}
