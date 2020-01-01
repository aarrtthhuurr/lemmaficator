import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

class Lexicon {
    private Map<String, String> map;

    Lexicon(String filePath) {
        map = new LinkedHashMap<>();

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

    public void add(String s1, String s2) {
        this.map.put(s1, s2);
    }
}
