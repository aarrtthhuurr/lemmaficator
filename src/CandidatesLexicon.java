import java.util.List;

abstract class CandidatesLexicon {
    private Lexicon lexicon;

    CandidatesLexicon(Lexicon lexicon) {
        this.lexicon = lexicon;
    }

    Lexicon getLexicon() {
        return lexicon;
    }

    abstract List<String> getCandidates(String token);
}
