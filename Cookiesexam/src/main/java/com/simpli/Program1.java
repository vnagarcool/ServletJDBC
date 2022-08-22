package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Program1")
public class Program1 extends HttpServlet{
	private Connection con;
	private PreparedStatement pstmt;

	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("text_1");
		String s1 = req.getParameter("Sid");
		int sid = Integer.parseInt(s1);
		String sname = req.getParameter("sname");
		String sem = req.getParameter("sem");
		
		String s2 = req.getParameter("percent");
		int percent = Integer.parseInt(s2);
		
		//cookie creation
		Integer i1= new Integer(sid);
		Cookie c1 =new Cookie("sid",i1.toString());
		
		Cookie c2 = new Cookie("sname", sname);
		
		Integer i2= new Integer(percent);
		Cookie c3 =new Cookie("percent",i2.toString());
		Cookie c4 = new Cookie("sem", sem);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		resp.addCookie(c4);
		
		
		//JDBC operations goes here
		PrintWriter writer = resp.getWriter();
		System.out.println("text_2");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			System.out.println("connected");
			String sql="insert into student values(?,?,?,?)";
			System.out.println("test_4");
			pstmt=con.prepareStatement(sql);
			System.out.println("test_5");
			pstmt.setInt(1, sid);
			pstmt.setString(2, sname);
			pstmt.setInt(3, percent);
			pstmt.setString(4, sem);
			
			int x = pstmt.executeUpdate();
			System.out.println("text_3");
			if(x>0) {
				resp.sendRedirect("success.html");
			}
			else {
				resp.sendRedirect("failure.html");
			}
			} catch (Exception e) {
		}
	}
}
