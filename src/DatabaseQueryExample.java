import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseQueryExample{

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sakaar";
    private static final String USERNAME = "localhost";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            if (connection != null) {
                System.out.println("Connected to the database!");

                // Creating a statement
                try (Statement statement = connection.createStatement()) {

                    // Submitting a query
                    String sqlQuery = "SELECT * FROM your_table_name";
                    try (ResultSet resultSet = statement.executeQuery(sqlQuery)) {

                        // Processing the results
                        while (resultSet.next()) {
                            // Access data from the result set
                            int id = resultSet.getInt("id");
                            String name = resultSet.getString("name");
                            // ... process other columns as needed
                            System.out.println("ID: " + id + ", Name: " + name);
                        }
                    }
                }
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("Connection failed or query execution error! Error: " + e.getMessage());
        }
    }
}