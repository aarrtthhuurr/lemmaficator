import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

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

    public static void main(String[] args) {
        Lexicon lexicon = new Lexicon(args[0]);

        do {
            StringTokenizer read = read();

            if (read == null) return;

            String token;
            String lemma;
            List<String> proximityCandidatesLemmas;
            List<String> levensheinCandidatesLemmas;

            while (read.hasMoreTokens()) {
                token = read.nextToken().toLowerCase().trim();

                // On s'arrête si le mot est < à notre seul de longueur minimal
                if (token.length() < MINIMUM_TOKEN_LENGTH) {
                    continue;
                }

                // Si on trouve un lemme associé au token, on le retourne
                if ((lemma = lexicon.getLemma(token)) != null) {
                    System.out.println("[" + token + "] => [" + lemma + "] (Lexicon)");
                    continue;
                }

                // Si on trouve un ou plusieurs lemmes candidats, on les retourne
                if (!(proximityCandidatesLemmas = new ProximityLexicon(lexicon).getCandidates(token)).isEmpty()) {
                    System.out.println("[" + token + "] => " + proximityCandidatesLemmas.toString() + " (Proximity)");
                    continue;
                }

                if ((levensheinCandidatesLemmas = new LevenshteinLexicon(lexicon).getCandidates(token)).isEmpty()) {
                    System.out.println("[" + token + "] => []");
                } else {
                    System.out.println("[" + token + "] => " + levensheinCandidatesLemmas.toString() + " (Levenshtein)");
                }
            }
        } while (true);
    }
}
