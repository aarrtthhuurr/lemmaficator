import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lexicon {
    private Map<String, String> map;

    Lexicon(String filePath) {
        map = new HashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] pair = line.split("\t");
                map.put(pair[0].toLowerCase().trim(), pair[1].toLowerCase().trim());
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Map<String, String> getMap() {
        return map;
    }

    public String replace(String token) {
        String replacement = getMap().get(token);
        return replacement != null ? replacement : token;
    }

    public List<String> replaceAll(List<String> tokens) {
        return tokens.stream().map(this::replace).collect(Collectors.toList());
    }
}
