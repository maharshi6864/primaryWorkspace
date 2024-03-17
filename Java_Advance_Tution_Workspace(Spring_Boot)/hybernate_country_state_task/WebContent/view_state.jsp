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
	<table >
		<c:forEach items="${sessionScope.searchstate}" var="i">
		<tr>
			<td>${i.id}</td>
			<td>${i.state}</td>
			<td>${i.countryVo.country}</td>
			<td><button><a href="save?id=${i.id}&flag=es">Edit</a></button></td>
			
		</tr>
		
		</c:forEach>
	
	</table>	
</body>
</html>