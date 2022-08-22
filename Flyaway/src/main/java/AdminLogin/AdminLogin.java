package com.flyaway;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.URegistration.dao.AdminLogindao;
import com.URegistration.dao.Logindao;
/**
* Servlet implementation class AdminLogin
*/
@WebServlet(&quot;/AdminLogin&quot;)
public class AdminLogin extends HttpServlet {
public static boolean isLoggedIn = false;
protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {

String email = request.getParameter(&quot;email&quot;);
String pass = request.getParameter(&quot;pass&quot;);
PrintWriter out = response.getWriter();
//out.println(email+&quot; &quot;+pass);
AdminLogindao logindao = new AdminLogindao();
if(logindao.check(email,pass)){

// HttpSession session = request.getSession();

//
// session.setAttribute(&quot;username&quot;, uname);
// out.println(&quot;User Logged In Successfully&quot;);
isLoggedIn = true;
out.println(&quot;You have LoggedIn&quot;);
response.sendRedirect(&quot;AdminDashboard.jsp&quot;);
}
else{
isLoggedIn = false;

out.println(&quot;Login Failed : Incorrect email or Password&quot;);
}
}
}