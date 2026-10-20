import java.sql.*;

public class App {
    public static void main(String args[]) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "Ayushyash@123"
        );
        System.out.println(con);
        System.out.println("Connection created");
        con.close();
    }
}