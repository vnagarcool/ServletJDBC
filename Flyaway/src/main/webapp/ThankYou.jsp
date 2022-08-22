a&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-
8859-1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;%@ page import=&quot;com.model.Search&quot; %&gt;
&lt;%@ page import=&quot;com.model.Booking&quot; %&gt;
&lt;%
Booking.name_on_card = request.getParameter(&quot;name_on_card&quot;);
Booking.card_details = request.getParameter(&quot;card_details&quot;);
if (Booking.name_on_card.equals(&quot;&quot;) ||
Booking.card_details.equals(&quot;&quot;)) {
out.println(&quot;Please enter valid card details&quot;);

}
%&gt;
&lt;!DOCTYPE html PUBLIC &quot;-//W3C//DTD HTML 4.01
Transitional//EN&quot; &quot;http://www.w3.org/TR/html4/loose.dtd&quot;&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=ISO-
8859-1&quot;&gt;
&lt;title&gt;Thank You&lt;/title&gt;
&lt;style&gt;
body
{

margin:0;
padding:0;

}
.container
{
top:50%;
left:50%;
position: absolute;
transform:translate(-50%,-50%);
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
margin-left:250px;
}
&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;

&lt;div class=&#39;container&#39;&gt;
&lt;h2 align=&quot;center&quot;&gt;&lt;span&gt;&lt;strong&gt;Thank
You&lt;/strong&gt;&lt;/span&gt;&lt;/h2&gt;

&lt;p align=&quot;center&quot;&gt;&lt;span&gt;&lt;strong&gt;Flight has
booked&lt;/strong&gt;&lt;/span&gt;&lt;/p&gt;
&lt;br&gt;
&lt;h3&gt;Ticket Details&lt;/h3&gt;
&lt;h4&gt;&lt;strong&gt;&lt;%=Search.source%&gt; to &lt;%=Search.destination%&gt; |
&lt;%=Search.date%&gt; (&lt;%=Search.day%&gt;)&lt;/strong&gt;&lt;/h4&gt;
&lt;p align=&quot;left&quot;&gt;&lt;%=Booking.flight_booking_id%&gt; -
&lt;%=Booking.flight_name%&gt; (Travellers
&lt;%=Search.persons%&gt;)&lt;/p&gt;&lt;br&gt;
&lt;br&gt;
&lt;h3&gt;&lt;strong&gt;Passenger Summary&lt;/strong&gt;&lt;/h3&gt;
&lt;h3&gt;Booking Name-&lt;%=Booking.passenger_name%&gt; | Email-
&lt;%=Booking.passenger_email%&gt; | Phone-
&lt;%=Booking.passenger_phone%&gt;&lt;/h3&gt;
&lt;br&gt;
&lt;h3&gt;&lt;strong&gt;Payment Summary&lt;/strong&gt;&lt;/h3&gt;
&lt;h4&gt;Payment By-&lt;%=Booking.name_on_card%&gt; | Card No-
&lt;%=Booking.card_details%&gt;&lt;/h4&gt;&lt;br&gt;
&lt;h2 align=&quot;right&quot;&gt;&lt;strong&gt;Total Paid-
Rs.&lt;%=Search.persons*Booking.ticket_price%&gt;&lt;/strong&gt;&lt;/h2&gt;&lt;br&gt;&lt;br
&gt;
&lt;p&gt;&lt;button onclick=&quot;window.print()&quot; id=Submit&gt;Print
Ticket&lt;/button&gt;&lt;/p&gt;
&lt;/div&gt;
&lt;/body&gt;
&lt;/html&gt;