<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
	<center>

		<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
		<table width="50%">
			<tr>
				<th colspan="5"><h1><u><i>Data</i></u></h1></th>
			</tr>
			<tr>
				<th colspan="5" height="20px"></th>
			</tr>
			<tr>
				<th style="text-align: left;">No</th>
				<th style="text-align: left;">Unique Id</th>				
				<th style="text-align: left;">First Name</th>
				<th style="text-align: left;">Last Name</th>
				<th style="text-align: left;">Gender</th>
				<th style="text-align: left;">Hobbies</th>
				<th style="text-align: left;">Address</th>
				<th style="text-align: left;">Phone Number</th>
				<th style="text-align: left;">Username</th>
				<th style="text-align: left;">Password</th>
				<th style="text-align: left;">Edit</th>
			</tr>
			<tr>
				<th colspan="5" height="20px"></th>
			</tr>
			<c:forEach items="${dtoList}" var="i" varStatus="j">
				<tr>
					<td>${j.count}</td>
					<td>${i.uqid}</td>
					<td>${i.firstname}</td>
					<td>${i.lastname}</td>
					<td>${i.gender}</td>
					<td><c:forEach items="${i.hobbies}" var="j" varStatus="k">${j}, </c:forEach></td>
					<td>${i.address}</td>
					<td>${i.phone}</td>
					<td>${i.username}</td>
					<td>${i.password}</td>
					<td><a href="delete?id=${i.id}">delete</a></td>
					<td><a href="edit?id=${i.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>