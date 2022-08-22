import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.Driver;

public class JDBCRegistereDriverCode {
	private static Connection con;
	private static java.sql.Statement stmt;
	private static java.sql.CallableStatement cstmt;
	private static PreparedStatement pstmt;
	
	public static void main(String[] args ) throws SQLException {
		try {	
		//Code to load the Driver 
			Driver d = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Registered using approach 1");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Registered using approach 2");
			//Code to establish the connection 
			String url = "jdbc:mysql://localhost:3306/trail";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection to the Database is success");
			String sql = "select * from student";
			stmt = con.createStatement();//when no user input is taken 
			System.out.println("Statement created");
			cstmt = con.prepareCall(sql);//when multiple statements are to executed
			System.out.println("Callable Statement created");
			pstmt = con.prepareStatement(sql);
			System.out.println("Prepared Statement created");
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception Occured");
		}
		finally {
			stmt.close();
			System.out.println("Statement closed");
			cstmt.close();
			System.out.println("Callable Statement closed");
			pstmt.close();
			System.out.println("Prepared Statement closed");
			con.close();
			System.out.println("COnnection closed");
	}
	
	}
}



