package com.simpli;

import java.io.IOException;
import java.io.PrintWritter;

import jakarta.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Program
 */
public class Program extends HttpServlet {
 void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	PrintWriter writer = response.getWriter();
	writer.println(name);
 }

}
