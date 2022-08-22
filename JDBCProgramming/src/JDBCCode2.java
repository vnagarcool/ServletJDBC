import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCCode2 {
	private static Connection con;
	private static Statement stmt;
	private static ResultSet res;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver"); //loading the driver
		System.out.println("Driver Loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplijdbc", "root", "root"); //establishing connection
	
		//Query to insert data into database table 
		String sql = "select * from student";
		
		//create statement to be created
		stmt = con.createStatement();
		
		//Execute the query 
		res = stmt.executeQuery(sql);
		
		while(res.next()==true) {
			//System.out.println(res.getInt(1)+"---"+res.getString(2)+"---"+res.getInt(3)+"---"+res.getString(4));
			System.out.println(res.getInt("sid")+"---"+res.getString("sname")+"---"+res.getInt("percentage")+"---"+res.getString("sem"));

		}
		res.close();
		stmt.close();
		con.close();
	}
}
