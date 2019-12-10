import java.util.Set;

public class LemmasLexicon extends Lexicon {
    private Set<String> ignored;

    public LemmasLexicon(String filePath) {
        super(filePath);
    }

    // Ignored tokens will be returned as if they were a Lemma
    public LemmasLexicon(String filePath, Set<String> ignored) {
        super(filePath);
        this.ignored = ignored;
    }

    public String getLemma(String token) {
        if (ignored.contains(token)) {
            return token;
        }
        return getMap().get(token);
    }
}
