import java.io.*;
import java.util.List;
import java.util.Properties;

class Main {
    private static Properties properties = new Properties();

    private static String read() {
        BufferedReader bufferedReader;
        String prompt;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("> ");
            prompt = bufferedReader.readLine();
            return prompt;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try (InputStream configFile = new FileInputStream("config.properties")) {
            properties.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SQLManager sqlManager = new SQLManager(
                properties.getProperty("psqlUrl"),
                properties.getProperty("psqlUsername"),
                properties.getProperty("psqlPassword"),
                properties.getProperty("psqlDatabase")
        );

        Analyzer analyzer = new Analyzer(
                sqlManager,
                properties.getProperty("wordsByLemmaPath"),
                properties.getProperty("structurePath"),
                properties.getProperty("stopListPath")
        );
        analyzer.setChoseInConsole(true);

        String request;
        while ((request = read()) != null) {
            Response response = analyzer.run(request);

            System.out.println(response.getMetadata().toString());

            if (response.success()) {
                response.getResults().forEach(System.out::println);
            } else {
                System.err.println("Conflict on " + response.getConflict());
            }
        }
    }
}
