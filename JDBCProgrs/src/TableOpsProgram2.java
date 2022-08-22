import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TableOpsProgram2 {
	private static Connection con;
	private static Statement stmt;
	private static Statement pstmt;
	private static PreparedStatement Pstmt;

	public static void main(String[] args) throws SQLException {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/trail";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);	
			String sql = "insert into student2022 values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);//added value to 1st placeholder
			 pstmt.setString(2, "rahul");//added value to 2nd placeholder
			 pstmt.setInt(3, 77);//added value to 3rd placeholder
			
			 Pstmt.executeUpdate(sql);
			System.out.println("Executed and added value to the table");
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
