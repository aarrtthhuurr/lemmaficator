import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
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

    private static List<String> lemmifier(LemmasLexicon lemmasLexicon, List<String> tokens) {
        return tokens.stream()
                .map(token -> token.toLowerCase().trim())
                .filter(token -> token.length() >= MINIMUM_TOKEN_LENGTH)
                .map(token -> {
                    String lemma;
                    if ((lemma = lemmasLexicon.getLemma(token)) != null) {
                        return lemma;
                    }

                    List<String> proximityCandidatesLemmas;
                    if (!(proximityCandidatesLemmas = new ProximityLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
                        return proximityCandidatesLemmas.get(0); // TODO: We chose to get the first, but another picking method is possible.
                    }

                    List<String> levensheinCandidatesLemmas;
                    if (!(levensheinCandidatesLemmas = new LevenshteinLexicon(lemmasLexicon).getCandidates(token)).isEmpty()) {
                        return levensheinCandidatesLemmas.get(0); // TODO: We chose to get the first, but another picking method is possible.
                    }

                    return null; // TODO: Actually, we returns null. It could also be the token itself.
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        LemmasLexicon lemmasLexicon = new LemmasLexicon(args[0]);
        ReplacementLexicon replacementLexicon = new ReplacementLexicon(args[1]);

        StringTokenizer tokens;

        while ((tokens = read()) != null ) {
            List<String> tokensList = Collections.list(tokens).stream().map(token -> ((String) token)).collect(Collectors.toList());
            System.out.println("Tokenized request: " + tokensList);

            List<String> lemmifiedList = lemmifier(lemmasLexicon, tokensList);
            System.out.println("Lemmified request: " + lemmifiedList);

            List<String> replacedTokenList = replacementLexicon.replaceAll(lemmifiedList);
            System.out.println("Simplified request: " + replacedTokenList);
        }
    }
}
