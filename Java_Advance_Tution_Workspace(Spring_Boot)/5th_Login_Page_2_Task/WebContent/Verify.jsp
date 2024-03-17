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
	String us=(String)request.getParameter("us");
	String pa=(String)request.getParameter("pa");
	String username=(String)session.getAttribute("username");
	String password=(String)session.getAttribute("password");
	
	if(us.equals(username)&&pa.equals(password)){
		response.sendRedirect("Welcome_Page.jsp");
	}
	else{
		session.setAttribute("error","Wrong Credentials");
		response.sendRedirect("Login_Page.jsp");		
	}
	
	
	
	%>
</body>
</html>