&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset=&quot;ISO-8859-1&quot;&gt;
&lt;title&gt;UserLogin&lt;/title&gt;
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
margin-left:50px;
}
&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
&lt;body&gt;
&lt;br&gt;
&lt;br&gt;
&lt;br&gt;
&lt;br&gt;
&lt;center&gt;&lt;h1&gt;Welcome to FlyAway &lt;/h1&gt;&lt;/center&gt;&lt;br&gt;
&lt;center&gt; &lt;h1&gt; User Login &lt;/h1&gt;&lt;/center&gt;&lt;br&gt;
&lt;div class=&#39;container&#39;&gt;

&lt;div class=&#39;card&#39;&gt;

&lt;br&gt;

&lt;form

action=&quot;UserLogin&quot; method=&quot;post&quot;&gt;
&lt;input name=&quot;name&quot; type=&quot;text&quot; placeholder=UserName
id=name&gt;&lt;br&gt;
&lt;input name=&quot;password&quot; type=&quot;password&quot;
Placeholder=Password id=name&gt;&lt;br&gt;
&lt;button type=&quot;submit&quot; value=&quot;Submit&quot; id=Submit &gt;LogIn&lt;/button&gt;
&lt;/form&gt;

&lt;/div&gt;

&lt;/div&gt;
&lt;/body&gt;
&lt;/html&gt;