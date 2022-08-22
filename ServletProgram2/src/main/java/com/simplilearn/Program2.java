package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Program2")
public class Program2 extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("Inside the init method");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Inside the service method");
		PrintWriter writer = response.getWriter();
		writer.print("Please check console window");
		writer.print("Please check console window");

	}
public void destroy() {
		System.out.println("Inside the destroy method");
	}
}
