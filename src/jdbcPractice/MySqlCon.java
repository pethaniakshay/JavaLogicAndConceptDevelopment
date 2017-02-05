package jdbcPractice;

import java.sql.*;

/**
 * The mot basic example to that shows how to connect to the MySQL database.
 */

public class MySqlCon {
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoDb","abcde","12345");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from person");
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        con.close();
        System.out.println("Hello");
    }
}
