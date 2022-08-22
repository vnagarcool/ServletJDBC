&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;%@ page import=&quot;com.flyaway.AdminLogin&quot; %&gt;
&lt;!DOCTYPE html PUBLIC &quot;-//W3C//DTD HTML 4.01
Transitional//EN&quot; &quot;http://www.w3.org/TR/html4/loose.dtd&quot;&gt;

&lt;html&gt;
&lt;head&gt;
&lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=ISO-
8859-1&quot;&gt;
&lt;title&gt;Password Change&lt;/title&gt;
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
h3{
color: Black
font-weight: bold;
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
}
label {
color: #8FBC8F;
font-weight: bold;
}
&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;

&lt;div class=&quot;container&quot;&gt;
&lt;div class=&quot;card&quot;&gt;
&lt;h1&gt;Password Change&lt;/h1&gt;
&lt;%
if (AdminLogin.isLoggedIn) {
%&gt;
&lt;form action=&quot;ChangePassword&quot; method=&quot;post&quot;&gt;
&lt;div&gt;
&lt;label &gt;Email address :
abhishekkumarbcet@gmail.com&lt;/label&gt;&lt;/br&gt;
&lt;/div&gt;
&lt;div &gt;
&lt;br/&gt;
&lt;label for=&quot;inputPassword&quot; &gt;New Password : &lt;/label&gt;
&lt;input type=&quot;password&quot; name=&quot;passwordEntered&quot;
placeholder=&quot;Enter a new password&quot; &gt;
&lt;/div&gt;
&lt;button type=&quot;submit&quot; id=&#39;Submit&#39;&gt;Change
Password&lt;/button&gt;
&lt;/form&gt;
&lt;%
}
else {
out.print(&quot;You must Login first&quot;);
}
%&gt;
&lt;/div&gt;
&lt;/div&gt;

&lt;/body&gt;
&lt;/html&gt;