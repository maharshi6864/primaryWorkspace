<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
	<%@taglib prefix="f" uri="http://java.sun.com/jstl/core_rt"%>
	<c:form action="saveState.html" modelAttribute="stateVo" method="post">
		<c:input path="state" value="${i.state}" />
		<br>
		<br>
		<br>
		<br>
		<c:select path="countryOb.id">
			<option value="${i.countryOb.id}" selected>${i.countryOb.country}</option>
			<f:forEach items="${countrylist}" var="j">
				<c:option value="${j.id}">${j.country}</c:option>
			</f:forEach>
		</c:select>
		<br>
		<br>
		<input type="submit" value="save">
	</c:form>
</body>
</html>