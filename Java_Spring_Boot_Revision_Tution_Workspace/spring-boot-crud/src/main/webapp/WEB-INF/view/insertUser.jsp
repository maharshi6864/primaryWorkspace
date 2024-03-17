<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
	<f:form action="registerUser" method="post" modelAttribute="userVo">
	<f:input type="hidden" path="id" />
		Enter firstname<f:input path="firstName" />
		<br>
		<br>
		Enter lastname<f:input path="lastName" />
		<br>
		<br>
		<f:button>Register</f:button>
	</f:form>
	<br>
	<a href="/"><button>Back</button></a>
</body>
</html>