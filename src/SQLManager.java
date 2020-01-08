import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class SQLManager {

    private Connection connection;

    SQLManager(String url, String username, String password, String database) {

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://" + url + "/" + database,
                    username,
                    password
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    List<String> request(String request, boolean duplicateColumns) {
        List<String> rows = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                StringBuilder row = new StringBuilder();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    row.append(resultSet.getObject(i).toString().trim()).append("\t");
                }

                String rowString = row.toString().substring(0, row.toString().length() - 1);
                if (duplicateColumns) {
                    rows.add(rowString);
                } else {
                    rows.add(Arrays.stream(rowString.split("\t")).distinct().collect(Collectors.joining("\t")));
                }
            }

            return rows;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return rows;
        }
    }
}
