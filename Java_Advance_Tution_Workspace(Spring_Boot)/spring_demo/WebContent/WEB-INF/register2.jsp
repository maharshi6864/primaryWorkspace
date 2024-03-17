<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
	<c:form method="post" modelAttribute="obj" action="login.html">
		Firstname: <c:input path="firstname"/>
		<br>
		Lastname: <c:input path="lastname"/><br>
		Username: <c:input path="username"/>
		<br>
		Password: <c:input path="password"/><br>
		<c:button type="submit" value="register"/>	
	</c:form>
</body>
</html>