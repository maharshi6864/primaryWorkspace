<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>saving here</title>
</head>
<body>
	<%
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String pass=request.getParameter("user");
		String user=request.getParameter("pass");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("INSERT INTO login(fn,ln,username,password) VALUE('"+fn+"','"+ln+"','"+pass+"','"+user+"')");
		s.close();
		c.close();
		response.sendRedirect("3.jsp");
	%>
</body>
</html>