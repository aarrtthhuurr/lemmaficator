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

    public static void main(String[] args) {
        FilterList filterList = new FilterList(args[2]);
        LemmasLexicon lemmasLexicon = new LemmasLexicon(args[0]);
        SubstitutionLexicon substitutionLexicon = new SubstitutionLexicon(args[1]);

        StringTokenizer tokens;

        while ((tokens = read()) != null ) {
            List<String> tokensList = Collections.list(tokens).stream().map(token -> ((String) token)).collect(Collectors.toList());
            System.out.println("> Initial request: " + tokensList);

            List<String> filteredList = filterList.removeFrom(tokensList);
            System.out.println("> After filter: " + filteredList);

            List<String> lemmifiedList = lemmifier(lemmasLexicon, tokensList);
            System.out.println("> After lemmafication: " + lemmifiedList);

            List<String> replacedTokenList = substitutionLexicon.replaceAll(lemmifiedList);
            System.out.println("> After substitutions: " + replacedTokenList);
        }
    }
}
