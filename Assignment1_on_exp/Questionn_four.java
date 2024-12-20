package Assignment1_on_exp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Questionn_four {
    public static void main(String[] args) {
        Connection connection5 = null;
        Statement statement5 = null;

        try {
            // Attempting to connect to a non-existent database
            String url5 = "jdbc:mysql://localhost:3306/non_existent_database";
            String user5 = "root";
            String password5 = "password";
            connection5 = DriverManager.getConnection(url5, user5, password5);

            // Attempting to execute invalid SQL
            statement5 = connection5.createStatement();
            String sql5 = "SELECT * FROM non_existent_table";
            statement5.executeQuery(sql5);

        } catch (SQLException e) {
            // Handling the exception and printing a message
            System.out.println("Caught SQLException: " + e.getMessage());
        } finally {
            try {
                // Closing the resources
                if (statement5 != null) {
                    statement5.close();
                }
                if (connection5 != null) {
                    connection5.close();
                }
            } catch (SQLException e) {
                // Handling any exceptions during resource closure
                System.out.println("Caught SQLException during closing: " + e.getMessage());
            }
        }
    }
}
