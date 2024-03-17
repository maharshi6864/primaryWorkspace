<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String a1="tvsfvsvfvg";
	String b1="Patel";
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement s=c.createStatement();
	s.executeUpdate("INSERT INTO demo(fn,LN) VALUES('"+a1+"','"+b1+"')");
	s.close();
	c.close();







%>
</body>
</html>