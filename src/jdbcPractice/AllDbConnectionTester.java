package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * JDBC connection checker for various databases.
 */
public class AllDbConnectionTester {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Select the Database provider: ");
        System.out.println("1. MySql");
        System.out.println("2. SQLite");
        System.out.println("3. Oracle");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("Enter the database name: ");
        String databaseName = sc.next();

        System.out.println("Enter the database user name: ");
        String userName = sc.next();

        System.out.println("Enter the password: ");
        String password = sc.next();

        int status=-1;

        switch (choice){
            case 1:
                status = AllDbConnectionTester.connectionStatus("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306/",databaseName,userName,password);
                break;
            default:
                status = -1;
        }

        if(status==1){
            System.out.println("Yes, You have made the connection");
        }
        else if (status==0){
            System.out.println("Sorry connection is not established please try again");
        }
        else {
            System.out.println("Something Went Wrong");
        }

    }

    static private int connectionStatus(String driverName,String dbURL,String dbName,String userName,String password){

        int status = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbURL+dbName,userName,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return status =2;
        } catch (SQLException e) {
            e.printStackTrace();
            return status =3;
        }
        return status=1;
    }
}
