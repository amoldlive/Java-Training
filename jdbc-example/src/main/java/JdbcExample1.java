import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample1 {
	public static void main(String[] args) {
			
		
		try {
			
			//step -1  - register a driver --ClassNotFoundException
			Class.forName("org.postgresql.Driver");
			
			
			//Step-2 Create Connection --SQLException
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/MyDB", "postgres", "postgres");
			
			System.out.println("Connected to Database");
			//logic
			
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
