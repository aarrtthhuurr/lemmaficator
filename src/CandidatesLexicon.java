import java.util.List;

abstract class CandidatesLexicon {
    private LemmasLexicon lemmasLexicon;

    CandidatesLexicon(LemmasLexicon lemmasLexicon) {
        this.lemmasLexicon = lemmasLexicon;
    }

    LemmasLexicon getLemmasLexicon() {
        return lemmasLexicon;
    }

    abstract List<String> getCandidates(String token);
}
