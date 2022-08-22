package com.flyaway;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Search;
/**
* Servlet implementation class SearchFlight

*/
@WebServlet(&quot;/SearchFlight&quot;)
public class SearchFlight extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
Search.date = request.getParameter(&quot;date&quot;);
Search.source = request.getParameter(&quot;source&quot;);
Search.destination = request.getParameter(&quot;destination&quot;);
Search.persons =
Integer.parseInt(request.getParameter(&quot;persons&quot;));
if (Search.date.equals(&quot;&quot;)) {
out.println(&quot;Please enter a valid date&quot;);
}
else {
//out.println(Search.date);
Search.day = getDay(Search.date);
// out.println(Search.day);
response.sendRedirect(&quot;SearchResult.jsp&quot;);
}
}
public String getDay(String dateInp) {
// ZonedDateTime d = ZonedDateTime.parse(dateInp);
LocalDate dt = LocalDate.parse(dateInp);
return dt.getDayOfWeek().toString();
}
}