package db;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/course_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";

    static Connection conn = null;

    public static Connection getConnection() throws SQLException{
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);

        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
            System.out.print(e.getMessage());
        }

        return conn;
    }
}
