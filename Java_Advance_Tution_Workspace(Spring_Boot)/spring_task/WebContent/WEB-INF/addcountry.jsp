<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add_Country</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
	<c:form action="savecountry.html" method="post" modelAttribute="countryOb">
		<c:input path="country"/>
		<c:button type="submit">Save Country</c:button>
	</c:form>
</body>
</html>