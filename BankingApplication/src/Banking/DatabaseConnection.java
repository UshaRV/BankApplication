package Banking;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
	 
        static Connection con;
		public static Connection createC() {
			try {
				// load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//create the connection
				String user = "root";
				String password = "Ashok@1997";
				String url= "jdbc:mysql:localhost:3306/banking ";
				con=DriverManager.getConnection(url,user, password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}
}
