import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubstitutionLexicon extends Lexicon {

    public SubstitutionLexicon(String filePath) {
        super(filePath);
    }

    public String replace(String token) {
        String replacement = getMap().get(token);
        return replacement != null ? replacement : token;
    }

    public List<String> replaceAll(List<String> tokens) {
        return tokens.stream().map(this::replace).collect(Collectors.toList());
    }
}
