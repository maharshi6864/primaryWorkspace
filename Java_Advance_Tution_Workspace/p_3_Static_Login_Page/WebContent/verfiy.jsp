<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verify</title>
</head>
<body>
	<%
		String us=request.getParameter("username");
		String pass=request.getParameter("password");
		if(us.equals("admin")&&pass.equals("admin")){
			response.sendRedirect("welcome.jsp");
		}
		else{
			response.sendRedirect("Login.jsp");
		}
	
	%>
</body>
</html>