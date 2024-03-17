<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
	<f:form action="addUser" method="post" modelAttribute="registerVo">
		Enter Firstname  :  <f:input path="firstname" />
		<br>
		<br>
		Enter Lastname  :  <f:input path="lastname" />
		<br>
		<br>
		Enter Username  :  <f:input path="username" />
		<br>
		<br>
		Enter Password  :  <f:input path="password" />
		<br>
		<br>
		<f:button type="submit">Register</f:button>

	</f:form>
</body>
</html>