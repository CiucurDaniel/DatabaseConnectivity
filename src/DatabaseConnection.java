import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static void main(String[] args) {
        DatabaseConnection obj_DB_Connection=new DatabaseConnection();
        Connection connection=null;
        connection=obj_DB_Connection.get_connection();
        System.out.println(connection);
    }

    public Connection get_connection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse","root","Parolameadesql1234");
        }catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}
