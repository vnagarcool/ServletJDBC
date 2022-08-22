import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class ProgramForDBOpsUsingPrepareStmt2 {

	private static String sql;
	//private static ResultSet res;
	private static java.sql.Connection con;
	private static Statement stmt;
	private static PreparedStatement pstmt;
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
                System.out.println("Enter the DB name");
                String db_name = sc.next();
                sql = "create database "+db_name;//? --> is the placeholder
                pstmt = con.prepareStatement(sql);
                 
                int x = pstmt.executeUpdate();
               System.out.println("executed");
            }
            else if(n==2) {
                sql = "show databases";
                stmt = con.createStatement();
                res = stmt.executeQuery(sql);
                while(res.next()==true) {
                    System.out.println(res.getString("Database"));
                }
            }
            else {
                System.out.println("Enter the DB name");
                String db_name =sc.next();
                sql = "drop database "+db_name;//? --> is the placeholder
                pstmt = con.prepareStatement(sql);
                
                int x = pstmt.executeUpdate();
                System.out.println("exceuted");
                }           
		}
            catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception generated as the class was not found");
			e.printStackTrace();
			}
			//5. close all open items 
			finally{
				try {
					//pstmt.close();
					res.close();
					stmt.close();
					con.close();
					}
				catch (Exception e) {
				System.out.println("error closing connection");
			}
		}
	}
}