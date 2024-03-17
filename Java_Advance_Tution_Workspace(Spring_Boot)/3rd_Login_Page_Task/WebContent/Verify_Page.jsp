<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Submitted DATA</h1>
	<%	
    	String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		String a = "admin";
		
		if(user.equals(a) && pass.equals(a)){
			response.sendRedirect("Welcome_Page.jsp");
		}
		else{
			response.sendRedirect("Login_Page.jsp");
		}
    	%><br><br>  
		
</body>
</html>