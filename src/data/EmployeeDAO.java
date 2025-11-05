package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    private static final String dbUrl = "jdbc:mysql://localhost/newbd1";
    private static final String username = "root";
    private static final String password = "Root@123";
    public void save()
    {
        String sql = "insert into employee values(?,?,?,?)";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
//            setData

            int roeEffected = presmt.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("Unable to connect to database");
        }
    }
}
