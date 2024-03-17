<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	ResultSet r=(ResultSet)session.getAttribute("ls");
	%><table border="1px solid black" height="100px" width="50px">
	<%
	try{
		
		while (r.next()) {
			int id=r.getInt("id");
			String fnn = r.getString("firstname");
			String ln = r.getString("lastname");	
			%><tr><%%><tr><%out.print(id);%></td><td><%out.print(fnn);%></td><td><%out.print(ln);%></td><%%></tr><%
	}
			
	}catch(Exception e){
		
	}
	
	
	%></table>
</body>
</html>