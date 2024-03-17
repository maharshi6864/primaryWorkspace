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
	<c:form method="post" modelAttribute="register" action="save.html">
		Firstname: <c:input path="firstname"/>
		<br>
		Lastname: <c:input path="lastname"/><br>
		Username: <c:input path="loginOb.username"/>
		<br>
		Password: <c:input path="loginOb.password"/><br>
		<c:hidden path="id"/>
		<c:button type="submit" >Register</c:button>	
	</c:form>
	<a href="search.html">click to search</a>

</body>
</html>