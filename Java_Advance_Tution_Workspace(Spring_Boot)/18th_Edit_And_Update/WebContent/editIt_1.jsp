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
		int id=Integer.parseInt(request.getParameter("id"));
		String fn=request.getParameter("fn_edit");
		String ln=request.getParameter("ln_edit");
		Class.forName("com.mysql.jdbc.Driver");	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("UPDATE form SET fn = '"+fn+"', ln = '"+ln+"' WHERE id='"+id+"';");
	
	
	
	%>
</body>
</html>