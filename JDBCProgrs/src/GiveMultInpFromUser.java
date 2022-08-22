import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiveMultInpFromUser {

	private static Connection con;
	private static Statement stmt;
	private static PreparedStatement pstmt;

	public static void main(String[] args) throws SQLException {

		try {
			// 1. Load the driver
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/Trail";
			String user = "root";
			String password = "root";
			con = DriverManager.getConnection(url, user, password);

			String sql = "Insert into student2022 values(?,?,?)";

			System.out.println("Enter the number of records to be inserted");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			pstmt = con.prepareStatement(sql);
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter the id:");
				pstmt.setInt(1, sc.nextInt());// added value to 1st placeholder

				System.out.println("Enter the name:");
				pstmt.setString(2, sc.next());// added value to 2nd placeholder

				System.out.println("Enter the percentage:");
				pstmt.setInt(3, sc.nextInt());// added value to 3rd placeholder
				pstmt.executeUpdate();

				System.out.println("Executed and added value to the table");

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			pstmt.close();
			con.close();
		}
	}
}