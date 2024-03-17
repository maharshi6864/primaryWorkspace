<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jstl</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
	<c:set var="i" value="300"></c:set>
	${i}<br>
	<c:out value="${i}"></c:out>
	<c:forEach var="f" begin="1" end="10">${i }<br>
	<c:if test="${f	 eq 3}">${"Hello World" }</c:if>
	</c:forEach>
	<c:set var="j" scope="session"  value="500" ></c:set>
	
	<c:out value="${sessionScope.j }"></c:out>
	<c:remove var="j" scope="session"/>
	<c:out value="${sessionScope.j }"></c:out>
	<c:set var="t" value="30"></c:set>
	<c:choose >
		<c:when test="${t eq 300 }">
		Hello Worldxkdfgjhbj		
		</c:when>
		<c:otherwise>
		Hello You		
		</c:otherwise>
	
	
	
	
	</c:choose>
	<c:forTokens items="3,4,5,65,6,7,7,8,7,65,5,4,4" delims="," var="f">
		${f}
	</c:forTokens>
	
</body>
</html>