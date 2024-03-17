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
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		String us=(String)session.getAttribute("userName");
		String pa=(String)session.getAttribute("passWord");	
		if(user.equals(us)&&pass.equals(pa)){
			response.sendRedirect("welcome.jsp");
		}
		else{
			session.setAttribute("error","Wrong Credentials");
			response.sendRedirect("Login.jsp");
		}
	%>
</body>
</html>