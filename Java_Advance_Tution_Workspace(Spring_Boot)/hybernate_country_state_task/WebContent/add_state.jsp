<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
	<form action="save" method="post">
		<input type="hidden" name="flag" value="is">
		Enter Country :
		<select name="countryid">
			<option selected="disable">Enter Country</option>
			<c:forEach items="${sessionScope.sc}" var="i">
			<option value="${i.id}">${i.country}</option>
		
		</c:forEach>
		</select>
				<br>
		
		Enter  state : 
		<input type="text" name="statename" >
		<br>
		<input type="submit" value="save">
	</form>
</body>
</html>