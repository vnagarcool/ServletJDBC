package com.URegistration.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class ChangePasswordAdmindao {
String url =&quot;jdbc:mysql://localhost:3306/flyaway&quot;;
String username=&quot;root&quot;;
String password=&quot;Abhi@123&quot;;
String sql = &quot;Update AdminLogin set PassWord=? Where Email=?;&quot;;
public boolean check(String pass){
boolean flag =false;
try {
Class.forName(&quot;com.mysql.cj.jdbc.Driver&quot;);
Connection con =

DriverManager.getConnection(url,username,password);

PreparedStatement st = con.prepareStatement(sql);
st.setString(1,pass);
st.setString(2,&quot;abhishekkumarbcet@gmail.com&quot;);
int rs = st.executeUpdate();
if(rs == 1){
flag =true;
return flag;
}
} catch (Exception e) {
e.printStackTrace();
}
return flag;

}
}