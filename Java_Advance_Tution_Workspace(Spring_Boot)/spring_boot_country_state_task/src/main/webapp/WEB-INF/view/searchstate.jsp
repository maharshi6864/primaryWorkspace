<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<body>
	<table>
  <tr>
    <th>Id</th>
    <th>State</th>
    <th>Country</th>
    <th>Actions</th>
  </tr>
  <c:forEach items="${ searchStateList}" var="i">
  	<tr>
  	<td>${i.id}</td>
  	<td>${i.state}</td>
  	<td>${i.countryVo.country}</td>
  	<td><a href="edit?id=${i.id}">EDIT</a> <br> <a href="delete?id=${i.id}"></a></td>
  </tr>
  </c:forEach>
</table>

</body>
</html>