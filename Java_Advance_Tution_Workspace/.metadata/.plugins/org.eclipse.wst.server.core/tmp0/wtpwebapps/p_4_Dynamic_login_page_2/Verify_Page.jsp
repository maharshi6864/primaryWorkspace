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
		String us=request.getParameter("username");
		String pa=request.getParameter("password");
		String pass=(String)session.getAttribute("passWord");
		String user=(String)session.getAttribute("userName");
		if(user.equals(us)&&pass.equals(pa)){
			response.sendRedirect("Welcome_Page.jsp");
		}
		else{
			response.sendRedirect("Login_Page.jsp");
			session.setAttribute("error","Wrong Credentials");
		}
	
	
	
	
	%>
</body>
</html>