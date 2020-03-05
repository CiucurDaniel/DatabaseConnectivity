import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseTest obj_DAO=new DatabaseTest();
        obj_DAO.Check_Data();
    }
    public void Check_Data(){
        DatabaseConnection obj_DB_Connection=new DatabaseConnection();
        Connection connection=obj_DB_Connection.get_connection();
        PreparedStatement ps=null;
        try {
            String query="select * from products";
            ps=connection.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Item- "+rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
