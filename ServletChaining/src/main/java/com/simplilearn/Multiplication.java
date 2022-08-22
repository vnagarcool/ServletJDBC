package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Multiplication")
public class Multiplication extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String s1 = req.getParameter("num1");
		int num1 = Integer.parseInt(s1);
		String s2 = req.getParameter("num2");
		int num2 = Integer.parseInt(s2);
		
		int mul_res = num1 * num2;
		
		int add_res = (Integer) req.getAttribute("add_res");//---> store data in temp memory
		
		PrintWriter writer = resp.getWriter();
		writer.println("The addition result is : "+add_res);
		writer.println("The multiplication result is : "+mul_res);

	}
}
