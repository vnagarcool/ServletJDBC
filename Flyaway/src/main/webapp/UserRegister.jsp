&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset=&quot;ISO-8859-1&quot;&gt;
&lt;title&gt;User Registration&lt;/title&gt;
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
h3{
color: #8FBC8F;
font-weight: bold;
margin-left :20px;
}

&lt;/style&gt;
&lt;/head&gt;
&lt;body&gt;
&lt;center&gt;
&lt;h1&gt; Welcome to FlyAway&lt;/h1&gt; &lt;br/&gt;&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;
&lt;/center&gt;
&lt;div class=&#39;container&#39;&gt;
&lt;div class=&#39;card&#39;&gt;
&lt;h3&gt; User Registration &lt;/h3&gt;

&lt;form action=&quot;UserRegistration&quot;

method=&quot;post&quot; &gt;

&lt;input name=&quot;name&quot;
type=&quot;text&quot; maxlength=50 id=name placeholder=&quot;Name&quot;&gt;&lt;br&gt;

&lt;input name=&quot;email&quot; type=&quot;text&quot;

maxlength=100 id=name placeholder=&quot;e-mail&quot;&gt;&lt;br&gt;

&lt;input name=&quot;password&quot;

type=&quot;password&quot; maxlength=&quot;20&quot; id=name
Placeholder=&quot;password&quot;&gt;&lt;br&gt;

&lt;button type=&quot;submit&quot;

value=&quot;Submit&quot; id=Submit&gt;Sign Up&lt;/button&gt;
&lt;/form&gt;

&lt;/div&gt;
&lt;/div&gt;

&lt;/body&gt;
&lt;/html&gt;