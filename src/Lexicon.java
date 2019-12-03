import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lexicon {
    private Map<String, String> map;

    Lexicon(String filePath) {
        map = new HashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String wordByLemma;
            while ((wordByLemma = bufferedReader.readLine()) != null) {
                String[] pair = wordByLemma.split("\t");
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



}
