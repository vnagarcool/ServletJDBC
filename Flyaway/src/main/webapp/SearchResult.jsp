&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;

&lt;%@ page import=&quot;java.sql.*&quot;%&gt;
&lt;%@ page import=&quot;com.model.Search&quot; %&gt;
&lt;%
String driverName = &quot;com.mysql.cj.jdbc.Driver&quot;;
String connectionUrl = &quot;jdbc:mysql://localhost:3306/&quot;;
String dbName = &quot;flyaway&quot;;
String userId = &quot;root&quot;;
String password = &quot;Abhi@123&quot;;
String query = Search.getQuery();
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%&gt;
&lt;!DOCTYPE html PUBLIC &quot;-//W3C//DTD HTML 4.01
Transitional//EN&quot; &quot;http://www.w3.org/TR/html4/loose.dtd&quot;&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=ISO-
8859-1&quot;&gt;
&lt;title&gt;Welcome to Flyaway&lt;/title&gt;
&lt;style&gt;

#Submit{
border-radius: 10px;
background:dodgerblue;
border-bottom:1px;
color: solid white;
padding: 10px 10px;
margin-top:none;
border:none;
outline:none;
}
th, td {
padding: 10px;
text-align: Center;
background:rgb(50,50,50);
color: #8FBC8F;
}

table {
border: 1px solid black;
background:rgb(50,50,50);
color: #8FBC8F;
}
&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;

&lt;div&gt;
&lt;h2 align=&quot;center&quot;&gt;&lt;span&gt;&lt;strong&gt;Flights &lt;/strong&gt;&lt;/span&gt;&lt;/h2&gt;
&lt;p align=&quot;center&quot;&gt;&lt;span&gt;&lt;strong&gt;
You Searched flights from &lt;%=Search.source%&gt; to
&lt;%=Search.destination%&gt; &lt;br&gt;
Date of travel : &lt;%=Search.date%&gt; (&lt;%=Search.day%&gt;) &lt;br&gt;
No of travelers : &lt;%=Search.persons%&gt; &lt;br&gt;
&lt;/p&gt;
&lt;table border=1px align=center id=table &gt;
&lt;thead&gt;
&lt;tr&gt;
&lt;th scope=&quot;col&quot;&gt;Flight&lt;/th&gt;
&lt;th scope=&quot;col&quot;&gt;Source&lt;/th&gt;
&lt;th scope=&quot;col&quot;&gt;Destination&lt;/th&gt;
&lt;th scope=&quot;col&quot;&gt;Date&lt;/th&gt;
&lt;th scope=&quot;col&quot;&gt;Ticket Price(Rs)&lt;/th&gt;
&lt;th scope=&quot;col&quot;&gt;Select&lt;/th&gt;
&lt;/tr&gt;
&lt;/thead&gt;
&lt;tbody&gt;
&lt;br&gt;&lt;p align=&quot;center&quot;&gt;&lt;span&gt;&lt;strong&gt;Select a
flight&lt;/strong&gt;&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
&lt;%
try{
connection =
DriverManager.getConnection(connectionUrl+dbName, userId,
password);
statement=connection.createStatement();
resultSet = statement.executeQuery(query);
while(resultSet.next()){
%&gt;
&lt;tr bgcolor=&quot;#F5F5F5&quot;&gt;
&lt;td&gt;&lt;%=resultSet.getString(&quot;Name&quot;) %&gt;&lt;/td&gt;
&lt;td&gt;&lt;%=resultSet.getString(&quot;Source&quot;) %&gt;&lt;/td&gt;

&lt;td&gt;&lt;%=resultSet.getString(&quot;Destination&quot;) %&gt;&lt;/td&gt;
&lt;td&gt;&lt;%=Search.date%&gt;&lt;/td&gt;
&lt;td&gt;&lt;%=resultSet.getString(&quot;TicketPrice&quot;) %&gt;&lt;/td&gt;
&lt;td&gt;
&lt;form
action=&quot;${pageContext.request.contextPath}/BookFlight.jsp&quot;
method=&quot;post&quot;&gt;
&lt;input type=&quot;hidden&quot; id=&quot;name&quot; name=&quot;name&quot;
value=&quot;&lt;%=resultSet.getString(&quot;Name&quot;)%&gt;&quot;&gt;
&lt;input type=&quot;hidden&quot; id=&quot;ticket_price&quot;
name=&quot;ticket_price&quot;
value=&quot;&lt;%=resultSet.getString(&quot;TicketPrice&quot;)%&gt;&quot;&gt;
&lt;input type=&quot;hidden&quot; id=&quot;flight_id&quot; name=&quot;flight_id&quot;
value=&quot;&lt;%=resultSet.getString(&quot;FlightId&quot;)%&gt;&quot;&gt;
&lt;input type=&quot;submit&quot; class=&quot;btn btn-success&quot; value=&quot;Book
This Flight&quot; id=Submit&gt;
&lt;/form&gt;
&lt;/td&gt;
&lt;/tr&gt;
&lt;%
}
} catch (Exception e) {
e.printStackTrace();
}
%&gt;
&lt;/tbody&gt;
&lt;/table&gt;
&lt;/div&gt;
&lt;/body&gt;
&lt;/html&gt;