package com.simplilearn;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Addition")
public class Addition extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String s1 = req.getParameter("num1");
		int num1 = Integer.parseInt(s1);
		String s2 = req.getParameter("num2");
		int num2 = Integer.parseInt(s2);
		
		int add_res = num1 + num2;
		
		req.setAttribute("add_res", add_res);//---> store data in temp memory
		
		RequestDispatcher reqd = req.getRequestDispatcher("Multiplication");
		reqd.forward(req, resp);// take the req and resp and navigate to multiplication class
	}
}
