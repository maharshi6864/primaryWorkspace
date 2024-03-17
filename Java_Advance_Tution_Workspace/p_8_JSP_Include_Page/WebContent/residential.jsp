<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save.jsp">
	<input type="text" name="fn" placeholder="Enter first name">
	<br>
	<input type="text" name="ln" placeholder="Enter last name">
	<br><br>
	<br>
	Residential  Address:
	<br><br>
	<jsp:include page="add.jsp">
		<jsp:param value="r" name="s"/>
	</jsp:include>
	<br><br>
	<br>
	Permanent Address:
	<br><br>
	<jsp:include page="add.jsp">
		<jsp:param value="p" name="s"/>
	</jsp:include>
	<br><br>
	<br>
	<input type="submit" value="submit"> 
	</form>
</body>
</html>