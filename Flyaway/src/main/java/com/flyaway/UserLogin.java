package com.flyaway;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse

import com.URegistration.dao.Logindao;
/**
* Servlet implementation class ULogin
*/
@WebServlet(&quot;/UserLogin&quot;)
public class UserLogin extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {

String name = request.getParameter(&quot;name&quot;);
String password = request.getParameter(&quot;password&quot;);
PrintWriter out = response.getWriter();
//out.println(email+&quot; &quot;+pass);
Logindao logindao = new Logindao();
if(logindao.check(name,password)){

// HttpSession session = request.getSession();
//
// session.setAttribute(&quot;username&quot;, uname);
// out.println(&quot;User Logged In Successfully&quot;);
response.sendRedirect(&quot;SearchFlight.jsp&quot;);
}
else{
out.println(&quot;User Not Logged In&quot;);
}
}
}