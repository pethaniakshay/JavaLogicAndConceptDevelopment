package jdbcPractice;

import java.sql.*;

/**
 * Created by Angel on 05-Feb-17.
 */
public class InsertUsingPreparedStatement {

    public static void main(String args[]){

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","abcde","12345");

            /*PreparedStatement stmnts = con.prepareStatement("select * from person");
            ResultSet rs = stmnts.executeQuery();
            while (rs1.next()){
                System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
            }
            con.close();*/

            PreparedStatement stmnt = con.prepareStatement("insert into emp values(?,?)");
            stmnt.setInt(1,1);
            stmnt.setString(2,"Ashu");
            stmnt.executeUpdate();

            stmnt.setInt(1,2);
            stmnt.setString(2,"Piyu");
            stmnt.executeUpdate();

            System.out.println("Inserted Recodrd is: ");

            PreparedStatement stmnt2 = con.prepareStatement("select * from emp");
            ResultSet rs = stmnt2.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            rs.close();
            stmnt.close();
            stmnt2.close();
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
