package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Program4") //used to avoid the config line in web.xml
public class Program4 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age_str = request.getParameter("age");
		int age = Integer.parseInt(age_str);
		String pwd = request.getParameter("password");

		
		PrintWriter writer = response.getWriter();
		writer.print(name+" is of the age: "+age);
	}
}
