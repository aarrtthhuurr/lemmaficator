import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLManager {

    private Connection connection;

    public SQLManager(String url, String username, String password, String database) {

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://" + url + "/" + database,
                    username,
                    password
            );
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> request(String request) {
        List<String> rows = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                StringBuilder row = new StringBuilder();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    row.append(resultSet.getObject(i).toString());
                }
                rows.add(row.toString().replaceAll("\\s+", "\t"));
            }

            return rows;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return rows;
        }




    }
}
