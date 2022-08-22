&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;%@ page import=&quot;com.model.Booking&quot; %&gt;
&lt;%@ page import=&quot;com.model.Search&quot; %&gt;
&lt;%
Booking.passenger_name = request.getParameter(&quot;pname&quot;);
Booking.passenger_email= request.getParameter(&quot;email&quot;);
Booking.passenger_phone= request.getParameter(&quot;phone&quot;);
if (Booking.passenger_name.equals(&quot;&quot;)
|| Booking.passenger_email.equals(&quot;&quot;)
|| Booking.passenger_phone.equals(&quot;&quot;)) {
out.println(&quot;Please enter valid passenger details&quot;);
}
else {
%&gt;
&lt;!DOCTYPE html PUBLIC &quot;-//W3C//DTD HTML 4.01
Transitional//EN&quot; &quot;http://www.w3.org/TR/html4/loose.dtd&quot;&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=ISO-
8859-1&quot;&gt;
&lt;title&gt;Payment Details&lt;/title&gt;
&lt;style&gt;
body
{

margin:0;
padding:0;

}
.container{
top:50%;
left:50%;
position: absolute;
transform:translate(-50%,-50%);
}
.card{
padding:60px 40px 50px 40px;
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
margin-left:100px;
}
label {
color: #8FBC8F;
font-weight: bold;
}
p{
color:#8FBC8F;
font-weight: bold;
}
&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
&lt;section &gt;
&lt;section &gt;
&lt;div class=&quot;row&quot;&gt;
&lt;div class=&quot;col&quot;&gt;
&lt;h1 align=&quot;center&quot; &gt;&lt;b&gt;Checkout&lt;/b&gt;&lt;/h1&gt;

&lt;p align=&quot;center&quot; &gt;&lt;span&gt;&lt;strong&gt;Enter Payment
Details&lt;/strong&gt;&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
&lt;/div&gt;
&lt;/div&gt;

&lt;section&gt;
&lt;div class=&#39;container&#39;&gt;
&lt;div class=&#39;card&#39;&gt;
&lt;form
action=&quot;${pageContext.request.contextPath}/ThankYou.jsp&quot;
method=&quot;post&quot; class=&quot;form-container&quot;&gt;
&lt;div &gt;
&lt;label for=&quot;card_details&quot; id=&#39;label&#39;&gt;UPI Id&lt;/label&gt;
&lt;input type=&quot;text&quot; name=&quot;name_on_card&quot;
placeholder=&quot;Enter UPI Id&quot; id=&#39;name&#39;&gt;
&lt;/div&gt;
&lt;div &gt;
&lt;label for=&quot;card_details&quot; id=&#39;label&#39;&gt;Card Number/Mobile
Number&lt;/label&gt;
&lt;input type=&quot;number&quot; name=&quot;card_details&quot;
placeholder=&quot;Enter Mobile Number&quot; id=&#39;name&#39;&gt;
&lt;/div&gt;
&lt;br&gt;
&lt;p align=&quot;left&quot;&gt;&lt;span&gt;&lt;strong&gt;Total Amount&lt;br&gt;
&lt;%=Booking.ticket_price%&gt; X &lt;%=Search.persons%&gt; persons =
Rs.&lt;%=Booking.ticket_price*Search.persons%&gt;&lt;/strong&gt;&lt;/span&gt;&lt;/p&gt;
&lt;button type=&quot;submit&quot; value=&quot;Submit&quot; id=&#39;Submit&#39;&gt;Pay
Through UPI&lt;/button&gt;
&lt;/form&gt;
&lt;/div&gt;
&lt;/div&gt;
&lt;/section&gt;
&lt;/section&gt;
&lt;/section&gt;

&lt;/body&gt;
&lt;/html&gt;
&lt;%
}
%&gt;