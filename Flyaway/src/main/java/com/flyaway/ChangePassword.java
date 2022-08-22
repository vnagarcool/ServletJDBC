package com.flyaway;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.URegistration.dao.ChangePasswordAdmindao;
/**
* Servlet implementation class ChangePassword
*/
@WebServlet(&quot;/ChangePassword&quot;)
public class ChangePassword extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
ChangePasswordAdmindao cdao = newChangePasswordAdmindao();

PrintWriter out = response.getWriter();

String pass = request.getParameter(&quot;passwordEntered&quot;);
if (!AdminLogin.isLoggedIn){
out.println(&quot;You must login first&quot;);
}
else if (pass.equals(&quot;&quot;)){
out.println(&quot;Password can&#39;t be empty&quot;);
}
else if (AdminLogin.isLoggedIn &amp;&amp; !pass.equals(&quot;&quot;)){
if(cdao.check(pass)){
out.println(&quot;Password changed. New Password is

&quot;+pass);

response.setContentType(&quot;text/html&quot;);
out.println();
out.println(&quot;&lt;a href=\&quot;AdminLogin.jsp\&quot;&gt;Admin

Login&lt;/a&gt;&quot;);
}
}
else {
out.println(&quot;Sorry, Something went wrong&quot;);
}
}
}