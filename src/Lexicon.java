import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Lexicon {
    private Map<String, String> wordsByLemma;

    Lexicon(String filePath) {
        wordsByLemma = new HashMap<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String wordByLemma;
            while ((wordByLemma = bufferedReader.readLine()) != null) {
                String[] pair = wordByLemma.split("\t");
                wordsByLemma.put(pair[0].toLowerCase().trim(), pair[1].toLowerCase().trim());
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Map<String, String> getLemmeByWords() {
        return wordsByLemma;
    }

    String getLemma(String token) {
        return wordsByLemma.get(token);
    }
}
