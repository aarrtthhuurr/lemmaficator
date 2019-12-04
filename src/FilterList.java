import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    private List<String> list;

    FilterList(String filePath) {
        list = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getList() {
        return list;
    }

    public List<String> removeFrom(List<String> tokens) {
        return tokens.stream().filter(token -> !list.contains(token)).collect(Collectors.toList());
    }
}
