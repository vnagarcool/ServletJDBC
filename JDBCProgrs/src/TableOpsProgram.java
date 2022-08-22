import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class TableOpsProgram {
	private static Connection con;
	private static Statement stmt;

	public static void main(String[] args) throws SQLException {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/trail";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);	
			String sql = "create table student2022("
			+"sid int, "
			+" sname varchar(30), "
			+" percentage int)";
		
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Executed and created the table");
			}
		catch (Exception e) {
			e.printStackTrace();
}
		finally {
			stmt.close();
			con.close();
		}
	}
}
