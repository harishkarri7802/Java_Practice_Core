//Program to implement a Singleton pattern using a private constructor and a static method.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



class DBConnection1{
    private DBConnection1(){

    }

    public static Connection conn = null;
    private static final String username ="root";
    private static final String url ="jdbc:mysql://localhost:3306/db";
    private static final String password ="root";

    public static Connection createConnection() {

        if(conn == null){
            try {
                conn = DriverManager.getConnection(username,url,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                System.out.println("Unexcepted error occured...........");;
            }

        }
        return conn;
    }
}

public class Week2_18 {

    public static void main(String[] args) {

        Connection db = DBConnection1.createConnection();
        Connection db2 = DBConnection1.createConnection();
        System.out.println(db);
        System.out.println(db2);
    }

}
