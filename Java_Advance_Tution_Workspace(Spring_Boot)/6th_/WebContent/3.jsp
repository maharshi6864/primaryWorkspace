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
			String fn=request.getParameter("firstname");
			String ln=request.getParameter("lastname");
			String user=request.getParameter("username");
			String pass=request.getParameter("password");
			out.print(fn);
			out.print(ln);
			out.print(user);
			out.print(pass);
		%>
</body>
</html>