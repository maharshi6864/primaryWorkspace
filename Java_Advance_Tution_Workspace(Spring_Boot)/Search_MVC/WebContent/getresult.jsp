<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"  import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1px solid black">
		<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
	<c:forEach items="${sessionScope.ls}" var="i2">
		<tr>
		<td>${i2.id}
		</td>
		<td>${i2.firstname}
		</td>
		<td>${i2.lastname}</td>
		
		<td><button><a
			href="delete?id=${i2.id}">delete</a></button><button><a  href="edit?id=${i2.id}">edit</a></button></td>
		</tr>
	</c:forEach>
	</table>
	
	

</body>
</html>