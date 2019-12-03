public class LemmasLexicon extends Lexicon {

    LemmasLexicon(String filePath) {
        super(filePath);
    }

    String getLemma(String token) {
        return getMap().get(token);
    }
}
