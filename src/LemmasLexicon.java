import java.util.HashMap;
import java.util.Map;

public class LemmasLexicon extends Lexicon {
    private Map<String, String> ignored;

    public LemmasLexicon(String filePath) {
        super(filePath);
        ignored = new HashMap<>();
    }

    // Ignored tokens will be returned as if they were a Lemma
    public LemmasLexicon(String filePath, Map<String, String> ignored) {
        super(filePath);
        this.ignored = ignored;
    }

    public String getLemma(String token) {
        if (ignored.containsKey(token)) {
            return ignored.get(token);
        }
        return getMap().get(token);
    }
}
