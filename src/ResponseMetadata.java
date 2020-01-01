import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ResponseMetadata {
    private Map<String, List<String>> tokens;
    private Map<String, String> sqlRequests;

    public ResponseMetadata() {
        tokens = new LinkedHashMap<>();
        sqlRequests = new LinkedHashMap<>();
    }

    public Map<String, List<String>> getTokens() {
        return tokens;
    }

    public void setTokens(Map<String, List<String>> tokens) {
        this.tokens = tokens;
    }

    public Map<String, String> getSqlRequests() {
        return sqlRequests;
    }

    public void setSqlRequests(Map<String, String> sqlRequests) {
        this.sqlRequests = sqlRequests;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        tokens.forEach((name, tokens) -> stringBuilder.append(name).append(" => ").append(tokens).append("\n"));
        sqlRequests.forEach((name, sqlRequest) -> stringBuilder.append(name).append(" => ").append(sqlRequest).append("\n"));

        return stringBuilder.toString();
    }
}
