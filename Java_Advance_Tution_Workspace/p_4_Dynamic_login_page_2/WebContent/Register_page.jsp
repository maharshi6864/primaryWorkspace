<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Login_Page.jsp">
	First name : <input type="text" name="firstname"><br><br>
	last name : <input type="text" name="lastname"><br><br>
	<%@ include file="Login_Page.jsp" %>
	
	</form>
</body>
</html>