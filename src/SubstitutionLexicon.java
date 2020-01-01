import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class SubstitutionLexicon extends Lexicon {

    SubstitutionLexicon(String filePath) {
        super(filePath);
    }

    private String replace(String token) {
        String replacement = getMap().get(token);
        return replacement != null ? replacement : token;
    }

    List<String> replaceAll(List<String> tokens) {
        return tokens.stream().map(this::replace).collect(Collectors.toList());
    }
}
