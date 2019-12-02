import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ProximityLexicon extends CandidatesLexicon {
    private static final int MINIMUM_WORD_LENGTH = 4;
    private static final int MINIMUM_PROXIMITY = 23;
    private static final int MAXIMUM_WORD_SHIFT = 5; // Maximum difference of length between two words
    private static final int MINIMUM_COMMON_LETTERS = 4;

    ProximityLexicon(Lexicon lexicon) {
        super(lexicon);
    }

    List<String> getCandidates(String token) {
        List<String> candidates = new ArrayList<>();

        if (super.getLexicon().getLemmeByWords().isEmpty()) return candidates;

        Double bestProximity = super.getLexicon().getLemmeByWords().entrySet().stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getValue(), getProximity(entry.getKey(), token)))
                .map(Map.Entry::getValue)
                .max(Double::compareTo)
                .get();

        super.getLexicon().getLemmeByWords().forEach((word, lemma) -> {
            double proximity = getProximity(word, token);

            if (proximity > MINIMUM_PROXIMITY && proximity == bestProximity)
                candidates.add(lemma);
        });

        return candidates;
    }

    private static int commonLettersCount(String a, String b) {
        String shorter = a.length() > b.length() ? b : a;

        for (int i = 0; i < shorter.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return i;
        }

        return shorter.length();
    }

    private Double getProximity(String m1, String m2) {
        if (m1.length() < MINIMUM_WORD_LENGTH || m2.length() < MINIMUM_WORD_LENGTH)
            return -1.0;

        if (Math.abs(m1.length() - m2.length()) > MAXIMUM_WORD_SHIFT)
            return -2.0;

        int commonLettersCount = commonLettersCount(m1, m2);

        if (commonLettersCount < MINIMUM_COMMON_LETTERS)
            return -3.0;

        return (double) commonLettersCount / (Math.max(m1.length(), m2.length())) * 100;
    }
}
