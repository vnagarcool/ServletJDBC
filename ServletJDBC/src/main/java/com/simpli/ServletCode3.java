package com.simpli;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletCode3")
public class ServletCode3 extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        try {
            PrintWriter writer = resp.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/simplijdbc","root","root");
            
            String sql = "select * from student";
            
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()==true) {
                writer.println(res.getInt(1));
                writer.println(res.getString(2));
                writer.println(res.getInt(3));
                writer.println(res.getString(4));
                writer.println("---------------");
            }
        }
        catch (Exception e) {
            // TODO: handle exce
        }
    }
}
