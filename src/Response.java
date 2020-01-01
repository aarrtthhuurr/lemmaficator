import java.util.ArrayList;
import java.util.List;

public class Response {
    private Lemma optionalLemma;
    private List<String> optionalResults;

    private ResponseMetadata metadata;

    public Response(Lemma lemma) {
        metadata = new ResponseMetadata();
        this.optionalLemma = lemma;
    }

    public Response(List<String> results) {
        metadata = new ResponseMetadata();
        this.optionalResults = results;
    }

    public boolean success() {
        return optionalLemma == null;
    }

    public Lemma getConflict() {
        return optionalLemma;
    }

    public List<String> getResults() {
        return success() ? (optionalResults != null ? optionalResults : new ArrayList<>()) : null;
    }

    public void addMetadata(String name, List<String> tokens) {
        metadata.getTokens().put(name, tokens);
    }

    public void addMetadata(String name, String sqlRequest) {
        metadata.getSqlRequests().put(name, sqlRequest);
    }

    public ResponseMetadata getMetadata() {
        return metadata;
    }
}
