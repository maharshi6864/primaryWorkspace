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
	<table border="1px solid black">
		<c:forEach items="${sessionScope.SearchList}" var="i">
	
			<form action="Rg" method="post">
				<input type="hidden" value="update" name="flag">
				<input type="hidden" value="${i.id}" name="id">
				First name: <input type="text" value="${i.firstname}" name="firstname"><br><br>
				Last name:<input type="text" value="${i.lastname}" name="lastname"><br><br>
				<input type="submit" value="update">
				
			
			</form>
	
		
		</c:forEach>
	
	
	</table>
</body>
</html>