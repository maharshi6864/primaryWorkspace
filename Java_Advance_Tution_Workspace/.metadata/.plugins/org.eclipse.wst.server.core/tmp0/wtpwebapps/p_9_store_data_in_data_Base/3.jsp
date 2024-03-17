
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello 
	<%
try{ 
Connection c= DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
Statement s=c.createStatement();
String sql ="SELECT * FROM record";

ResultSet r= s.executeQuery(sql);
%><table><%
while(r.next()){
%>
<tr bgcolor="#DEB887">

<td><%out.print(r.getString("fn")); %></td>
<td><%out.print(r.getString("ln")); %></td>
<td><%=r.getString("gender") %></td>
<td><%=r.getString("name") %></td>
<td><%=r.getString("email") %></td>

</tr>

<% 
}
%></table><%

} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>