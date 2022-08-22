import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCCode4 {
	private static Connection con;
	private static PreparedStatement pstmt;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");//loading the driver
		System.out.println("Driver Loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplijdbc", "root", "root");//establishing connection
		
		//Query to insert data into database table
		String sql = "update student set percentage=? where sid=?";//66--3
		
		//Create Statement to be created
		pstmt = con.prepareStatement(sql);
		
		//Complete the query using prepare statement
//		pstmt.setInt(1, 77);//static
//		pstmt.setInt(2, 2);//static
		
		System.out.println("Enter the percentage:");
		pstmt.setInt(1, sc.nextInt());//dynamic
		System.out.println("Enter the student id:");
		pstmt.setInt(2, sc.nextInt());//dynamic
		
		//Execute the query
		int x = pstmt.executeUpdate();
		if(x>0)
			System.out.println("Data modified");
		else
			System.out.println("Failed to modify data");
		
		pstmt.close();
		con.close();
	}
}
