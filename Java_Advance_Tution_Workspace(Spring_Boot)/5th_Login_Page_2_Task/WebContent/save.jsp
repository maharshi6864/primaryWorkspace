<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String Firstname=(String)request.getParameter("fn");
	out.print(Firstname);
	session.setAttribute("firstName", Firstname);
	String Lastname=(String)request.getParameter("ln");
	out.print(Lastname);
	session.setAttribute("lastname", Lastname);
	String Username=(String)request.getParameter("user");
	out.print(Username);
	session.setAttribute("username", Username);
	String Password=(String)request.getParameter("pass");
	out.print(Password);
	session.setAttribute("password", Password);
	response.sendRedirect("Login_Page.jsp");
	
	
	
	
	%>
</body>
</html>