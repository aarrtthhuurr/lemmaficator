import java.util.Collections;
import java.util.List;

public class Lemma {
    private String token; // Token is lemma's original value
    private List<String> values;

    public Lemma(String token, String value) {
        this.token = token;
        this.values = Collections.singletonList(value);
    }

    public Lemma(String token, List<String> choices) {
        if (choices.size() == 0) {
            throw new NullPointerException("Lemma's value cannot be null");
        }
        this.token = token;
        this.values = choices;
    }

    public String getToken() {
        return token;
    }

    public boolean hasConflict() {
        return values.size() > 1;
    }

    public List<String> getChoices() {
        if (!hasConflict()) {
            return null;
        }
        return values;
    }

    public String getValue() {
        return !hasConflict() ? values.get(0) : null;
    }

    @Override
    public String toString() {
        return !hasConflict() ? values.get(0) : (token + ":" + values.toString());
    }
}
