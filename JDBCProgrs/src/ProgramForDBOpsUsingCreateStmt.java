import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProgramForDBOpsUsingCreateStmt  {
	private static Connection con;
	private static Statement stmt;
	static String sql;
	private static ResultSet res;
	public static void main(String[] args) {
		System.out.println("1. Create Databases		2. View Databases		3.Drop Database");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try {
			//1. Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
		
			//2. connecting to the database
			String url = "jdbc:mysql://localhost:3306/trail";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);
		
			//3, Create the statement
			if(n==1) {
			sql = "create database CreateDBExmp1";
			stmt = con.createStatement();
			//4. Execute the statement
			int x = stmt.executeUpdate(sql);
			if(x>0) {
				System.out.println("Query excecuted with no issues");
			}
			else {
				System.out.println("Query execution failed");
			}
		}	
		else if(n==2);
			sql = "show databases";
			stmt = con.createStatement();
			res = stmt.executeQuery(sql);
			while(res.next()==true) {
			System.out.println(res.getString("Database"));
			}	
			}
	
            catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception generated as the class was not found");
			e.printStackTrace();
			}
			//5. close all open items 
			finally {
				try {
					stmt.close();
					con.close();
					}
				catch (Exception e) {
				System.out.println("error closing connection");
			}
		}
}
}