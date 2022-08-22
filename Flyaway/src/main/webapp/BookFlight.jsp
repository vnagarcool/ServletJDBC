&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;%@ page import=&quot;com.model.Booking&quot; %&gt;
&lt;%
Booking.flight_booking_id = request.getParameter(&quot;flight_id&quot;);
Booking.ticket_price =
Integer.parseInt(request.getParameter(&quot;ticket_price&quot;));
Booking.flight_name = request.getParameter(&quot;name&quot;);
%&gt;
&lt;!DOCTYPE html PUBLIC &quot;-//W3C//DTD HTML 4.01
Transitional//EN&quot; &quot;http://www.w3.org/TR/html4/loose.dtd&quot;&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=ISO-
8859-1&quot;&gt;
&lt;title&gt;Booking Details&lt;/title&gt;
&lt;style&gt;
body
{

margin:0;
padding:0;

}
.container{
top:50%;
left:45%;
position: absolute;
transform:translate(-50%,-50%);
}
.card{
padding:10px 10px 10px 10px;
background:rgb(50,50,50);

border-radius:10px;
}
#name{
border:none;
background:transparent;
border-bottom:1px solid white;
padding: 10px;
margin-bottom:15px;
color:white;
font-family: &quot;Times New Roman&quot;, Times, serif;
}
#Submit{
border-radius: 10px;
background:dodgerblue;
border-bottom:1px;
color: solid white;
padding: 10px 20px;
margin-top:15px;
border:none;
outline:none;
margin-left:50px;
margin-right:50px;
}
label {
color: #8FBC8F;
font-weight: bold;
}
&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
&lt;center&gt;
&lt;section &gt;
&lt;section &gt;

&lt;div class=&quot;row&quot;&gt;
&lt;div class=&quot;col&quot;&gt;
&lt;h1 align=&quot;center&quot;

&gt;&lt;b&gt;Booking Details&lt;/b&gt;&lt;/h1&gt;

&lt;p
align=&quot;center&quot;&gt;&lt;span&gt;&lt;strong&gt;Enter Passenger
Details&lt;/strong&gt;&lt;/span&gt;&lt;/p&gt;&lt;br&gt;

&lt;/div&gt;
&lt;/div&gt;

&lt;section &gt;
&lt;div class=&#39;container&#39;&gt;
&lt;div class=&#39;card&#39;&gt;
&lt;form
action=&quot;${pageContext.request.contextPath}/Payment.jsp&quot;
method=&quot;post&quot; class=&quot;form-container&quot;&gt;

&lt;label

for=&quot;pname&quot;&gt;Passenger Name&lt;/label&gt;

&lt;input
type=&quot;text&quot; name=&quot;pname&quot; placeholder=&quot;Name of Passenger&quot;&gt; &lt;br/&gt;
&lt;br/&gt;

&lt;label

for=&quot;email&quot;&gt;Email address&lt;/label&gt;

&lt;input
type=&quot;email&quot; name=&quot;email&quot; aria-describedby=&quot;emailHelp&quot;
placeholder=&quot;Enter email&quot;&gt; &lt;br/&gt; &lt;br/&gt;

&lt;label

for=&quot;phone&quot;&gt;Phone Number&lt;/label&gt;

&lt;input
type=&quot;number&quot; name=&quot;phone&quot; placeholder=&quot;Enter phone number&quot;&gt;
&lt;br/&gt; &lt;br/&gt;

&lt;br&gt;
&lt;button
type=&quot;submit&quot; value=&quot;Submit&quot; id=Submit&gt;Submit&lt;/button&gt;
&lt;/form&gt;

&lt;/div&gt;
&lt;/div&gt;
&lt;/section&gt;
&lt;/section&gt;
&lt;/section&gt;
&lt;/center&gt;
&lt;/body&gt;
&lt;/html&gt;