package bank.management.system; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author thasa
 */
public class NewConn {
    Connection c;
    Statement s;
    public NewConn() {
        try {
            // Load the JDBC driver (not necessary for JDBC 4.0 and later, but good practice)
             Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Test1234");
            // Create the statement
            s = c.createStatement();
            
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

 
}

