<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Response Page</title>
</head>
<body>
	<%
		String fn=request.getParameter("firstname");
		String ln=request.getParameter("lastname");
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		session.setAttribute("firstname", fn);
		session.setAttribute("lastname",ln);
		session.setAttribute("username",user);
		session.setAttribute("password",pass);	
		response.sendRedirect("login_3.jsp");
	%>
</body>
</html>