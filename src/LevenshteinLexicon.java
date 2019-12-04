import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

class LevenshteinLexicon extends CandidatesLexicon {
    private static final int SEUIL_LEVESHTEIN = 3;

    LevenshteinLexicon(LemmasLexicon lemmasLexicon) {
        super(lemmasLexicon);
    }

    List<String> getCandidates(String token) {
        Map<String, Integer> lemmaByDistance = super.getLemmasLexicon().getMap().entrySet().stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getValue(), getDistance(token, entry.getKey())))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (lemma1, lemma2) -> min(lemma1, lemma2)) // If we found duplicates lemmas, we select the shortest
                );

        int bestDistance = lemmaByDistance.values().stream().min(Integer::compareTo).orElse(0);

        return lemmaByDistance.entrySet().stream()
                .filter(entry -> entry.getValue() <= SEUIL_LEVESHTEIN && bestDistance == entry.getValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

    private static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }

    private int getDistance(String x, String y) {
        int[][] distance = new int[x.length() + 1][y.length() + 1];
        Pair<Character, Character> previousTuple = null;

        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0) {
                    distance[i][j] = j;
                }
                else if (j == 0) {
                    distance[i][j] = i;
                }
                else {
                    distance[i][j] = min(distance[i - 1][j - 1]
                                    + costOfSubstitution(x.charAt(i - 1), y.charAt(j - 1)),
                            distance[i - 1][j] + 1,
                            distance[i][j - 1] + 1);

                    if (i == j && previousTuple != null
                            && x.charAt(i - 1) == previousTuple.getValue()
                            && y.charAt(j - 1) == previousTuple.getKey()) {
                        distance[i][j] /= 2;
                    }
                    else if (i == j) {
                        previousTuple = new Pair<>(x.charAt(i - 1), y.charAt(j - 1));
                    }
                }
            }
        }

        return distance[x.length()][y.length()];
    }
}
