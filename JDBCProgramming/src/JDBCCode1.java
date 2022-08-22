import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCCode1 {
	private static Connection con;
	private static PreparedStatement pstmt;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver"); //loading the driver
		System.out.println("Driver Loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplijdbc", "root", "root"); //establishing connection
	
		//Query to insert data into database table 
		String sql = "insert into student values(?,?,?,?)";
		//sid,sname,percentage,sem
		
		//prepare statement to be created as we are using the placeholder in the query 
		pstmt = con.prepareStatement(sql);
		//static insert to the sql query
		//pstmt.setInt(1, 0);
		//pstmt.setString(2, "Rahul");
		//pstmt.setInt(3, 67);
		//pstmt.setString(4, "4th sem");
		//dynamic insert to the sql query
		System.out.println("Enter the student id:");
		pstmt.setInt(1, sc.nextInt());
		System.out.println("Enter the student name:");
		pstmt.setString(2, sc.next());
		System.out.println("Enter the student percentage:");
		pstmt.setInt(3, sc.nextInt());
		System.out.println("Enter the student sem:");
		pstmt.setString(4, sc.next());
		
		
		int x = pstmt.executeUpdate();
		if(x>0)
			System.out.println("Data inserted");
		else
			System.out.println("Failed to insert data");
		
		pstmt.close();
		con.close();
	}
}
