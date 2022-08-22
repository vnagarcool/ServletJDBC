package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletCode1")
public class ServletCode1 extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = req.getParameter("url");//from index.html
			String user = req.getParameter("user");//from index.html
			String pwd = req.getParameter("pwd");//from index.html
			Connection con = (Connection) DriverManager.getConnection(url,user,pwd);
			PrintWriter writer = resp.getWriter();
			if(con!=null) {
				writer.print("Connection established. Test is successful");
			}
			else {
				writer.print("Connection not established. Test is failure");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
