import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lexicon {
    private Map<String, String> map;

    public Lexicon(String filePath) {
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

    public Map<String, String> getMap() {
        return map;
    }

    public void add(String s1, String s2) {
        this.map.put(s1, s2);
    }
}
