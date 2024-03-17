<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Country_List</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
	<%@taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
	<table>
		<c:forEach items="${countrylist}" var="i">
		
		<tr>
			<td>${i.id}</td>
			<td>${i.country}</td>
			
			<td><button> <a href="edit.html?id=${i.id}">edit</a> </button>
			
			</td>		
			<td><button> <a href="delete.html?id=${i.id}">delete</a> </button>
		
			</td>					
		</tr>
		
		</c:forEach>
	
	
	</table>
</body>
</html>