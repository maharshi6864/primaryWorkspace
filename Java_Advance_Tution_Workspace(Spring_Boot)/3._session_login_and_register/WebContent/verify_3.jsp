<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>verify page</title>
</head>
<body>
	<%
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String user=(String)session.getAttribute("username");
		String pass=(String)session.getAttribute("password");
		if(pass.equals(password)&&user.equals(username)){
			response.sendRedirect("welcome_3.jsp");
		}else{
			//response.sendRedirect("login_3.jsp");
			out.print("Wrong Credential");
		}
		
		
	
	
	
	
	%>
</body>
</html>