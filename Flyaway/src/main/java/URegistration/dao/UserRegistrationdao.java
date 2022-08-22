package com.URegistration.dao;
import java.sql.*;
public class UserRegistrationdao {
String url =&quot;jdbc:mysql://localhost:3306/flyaway&quot;;
String username=&quot;root&quot;;
String password=&quot;Abhi@123&quot;;
String sql = &quot;INSERT INTO user(Name,email,Password) VALUES
(?,?,?);&quot;;
public boolean check(String name, String email, String pass) {
boolean flag =false;
try {
Class.forName(&quot;com.mysql.cj.jdbc.Driver&quot;);
System.out.println(&quot;request in Try block of USERDAO&quot;);
Connection con =

DriverManager.getConnection(url,username,password);
System.out.println(&quot;connection successful&quot;);
PreparedStatement st = con.prepareStatement(sql);
st.setString(1,name);
st.setString(2,email);
st.setString(3,pass);
int rs = st.executeUpdate();
if(rs == 1){
flag =true;
return flag;
}
} catch (Exception e) {
e.printStackTrace();
System.out.println(&quot;Passed DAO&quot;);

}
return flag;
}
}