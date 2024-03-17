<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
	<form action="update">
		<c:forEach items="${sessionScope.ls}" var="i2">
		<input type="hidden" value="${i2.id}" name="id">
		<input type="text" value="${i2.firstname}" name="firstname">
		<input type="text" value="${i2.lastname}" name="lastname">		
		<input type="submit" value="update">
		
		
	</c:forEach>
	</form>
</body>
</html>