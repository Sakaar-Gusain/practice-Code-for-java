import java.sql.*;

public class JDBCCrudExample {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        createRecord("John Doe", 50000);
        readRecords();
        updateRecord(1, "Updated Name", 60000);
        readRecords();
        deleteRecord(1);
        readRecords();
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    private static void createRecord(String name, double salary) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO employees (name, salary) VALUES (?, ?)",
                     Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, salary);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record created successfully.");
            } else {
                System.out.println("Failed to create record.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readRecords() {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employees")) {

            System.out.println("Employee Records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateRecord(int id, String name, double salary) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE employees SET name = ?, salary = ? WHERE id = ?")) {

            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, salary);
            preparedStatement.setInt(3, id);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("Failed to update record.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteRecord(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM employees WHERE id = ?")) {

            preparedStatement.setInt(1, id);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("Failed to delete record. Record not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}