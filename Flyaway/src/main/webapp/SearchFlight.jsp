&lt;%@ page language=&quot;java&quot; contentType=&quot;text/html; charset=ISO-8859-
1&quot;
pageEncoding=&quot;ISO-8859-1&quot;%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset=&quot;ISO-8859-1&quot;&gt;
&lt;title&gt;SearchFlight&lt;/title&gt;
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
margin-left:250px;
margin-right:50px;
}
label {
color: #8FBC8F;
font-weight: bold;
}

&lt;/style&gt;
&lt;/head&gt;
&lt;br&gt;
&lt;br&gt;
&lt;br&gt;
&lt;br&gt;
&lt;center&gt; Welcome to FlyAway &lt;/center&gt;&lt;br&gt;

&lt;center&gt; Search Flight &lt;/center&gt;&lt;br&gt;

&lt;div class=&#39;container&#39;&gt;
&lt;div class=&#39;card&#39;&gt;
&lt;form
action=&quot;SearchFlight&quot; method=&quot;post&quot;&gt;

&lt;label for=&quot;date&quot;

id=&#39;lable&#39;&gt;Date&lt;/label&gt;

&lt;input type=&quot;date&quot; id=&quot;date&quot;

name=&quot;date&quot; placeholder=&quot;DD-MM-YYYY&quot;&gt;

&lt;label for=&quot;source&quot; id=&#39;lable&#39;&gt;Source&lt;/label&gt;
&lt;select id=&quot;source&quot; name=&quot;source&quot;&gt;
&lt;option value=&quot;Select Source&quot;&gt;Source&lt;/option&gt;
&lt;option value=&quot;Patna&quot;&gt;Patna&lt;/option&gt;
&lt;option value=&quot;New Delhi&quot;&gt;New Delhi&lt;/option&gt;
&lt;option value=&quot;Kolkata&quot;&gt;Kolkata&lt;/option&gt;
&lt;option value=&quot;Ranchi&quot;&gt;Ranchi&lt;/option&gt;
&lt;option value=&quot;Indore&quot;&gt;Indore&lt;/option&gt;
&lt;option value=&quot;Jaipur&quot;&gt;Jaipur&lt;/option&gt;
&lt;option value=&quot;Lucknow&quot;&gt;Lucknow&lt;/option&gt;
&lt;option value=&quot;Chandigarh&quot;&gt;Chandigarh&lt;/option&gt;
&lt;option value=&quot;Jammu&quot;&gt;Jammu&lt;/option&gt;

&lt;option value=&quot;Shimla&quot;&gt;Shimla&lt;/option&gt;
&lt;/select&gt;
&lt;label for=&quot;destination&quot; id=&#39;lable&#39;&gt;Destination&lt;/label&gt;
&lt;select id=&quot;destination&quot; name=&quot;destination&quot;&gt;
&lt;option value=&quot;Select Destination&quot;&gt;Destination&lt;/option&gt;
&lt;option value=&quot;Mumbai&quot;&gt;Mumbai&lt;/option&gt;
&lt;option value=&quot;Bangalore&quot;&gt;Bangalore&lt;/option&gt;
&lt;option value=&quot;Hyderabad&quot;&gt;Hyderabad&lt;/option&gt;
&lt;option value=&quot;Chennai&quot;&gt;Chennai&lt;/option&gt;
&lt;option value=&quot;Bhubaneshwar&quot;&gt;Bhubaneshwar&lt;/option&gt;
&lt;option value=&quot;Chattisgarh&quot;&gt;Chattisgarh&lt;/option&gt;
&lt;option
value=&quot;Thiruvananthapuram&quot;&gt;Thiruvananthapuram&lt;/option&gt;
&lt;option value=&quot;Goa&quot;&gt;Goa&lt;/option&gt;
&lt;option value=&quot;Dehradun&quot;&gt;Dehradun&lt;/option&gt;
&lt;option value=&quot;Ahmedabad&quot;&gt;Ahmedabad&lt;/option&gt;
&lt;/select&gt;
&lt;label for=&quot;persons&quot; id=&#39;lable&#39;&gt;No of Persons&lt;/label&gt;
&lt;select id=&quot;persons&quot; name=&quot;persons&quot;&gt;
&lt;option value=&quot;Select&quot;&gt;Select&lt;/option&gt;
&lt;option value=&quot;1&quot;&gt;1&lt;/option&gt;
&lt;option value=&quot;2&quot;&gt;2&lt;/option&gt;
&lt;option value=&quot;3&quot;&gt;3&lt;/option&gt;
&lt;option value=&quot;4&quot;&gt;4&lt;/option&gt;
&lt;option value=&quot;5&quot;&gt;5&lt;/option&gt;
&lt;/select&gt;
&lt;button type=&quot;submit&quot; value=&quot;Submit&quot; id=Submit&gt;Search
Flights&lt;/button&gt;
&lt;/form&gt;
&lt;/div&gt;
&lt;/div&gt;
&lt;/body&gt;
&lt;/html&gt;