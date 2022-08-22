package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletCode2 extends HttpServlet{

	private PreparedStatement pstmt;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		try {
			PrintWriter write = resp.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			String name = req.getParameter("name");//from index.html
			String user_id = req.getParameter("id");//from index.html
			int id = Integer.parseInt(user_id);
			String per = req.getParameter("percent");//from index.html
			int percent = Integer.parseInt(per);
			String sem = req.getParameter("sem");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplijdbc","root","root");
			String sql = "insert into student values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3,percent);
			pstmt.setString(4, sem);
			int x = pstmt.executeUpdate();
			if(x>0) {
			write.print("data inserted");
			}
			else {
				write.print("data not inserted");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
