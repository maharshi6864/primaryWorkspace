<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	<h1>${message}</h1>
	<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
	<c:form action="save.html" method="post" modelAttribute="regobj">
		<c:input path="firstname" type="text"/>
		<br>
		<c:input path="lastname" type="text"/>
		<br>
		<c:button type="submit">Register</c:button>
		
		
	</c:form>
</body>
</html>