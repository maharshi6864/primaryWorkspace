<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit State and country page</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
		<c:forEach items="${sessionScope.fs}" var="i">
	
			<form action="save" method="post">
				<input type="hidden" value="us" name="flag">
				<input type="hidden" value="${i.id}" name="id">
				State Name: <input type="text" value="${i.state}" name="state"><br><br>
				
				Country Name:<select name="cou">
					
				<option value="" disabled >change your state</option>
					<c:forEach items="${sessionScope.sc}" var="j">
						<c:if test="${i.countryVo.id eq j.id }">
							<option value="${j.id}" selected="selected">${j.country} </option>
						</c:if>
						<c:if test="${ i.countryVo.id ne j.id  }">
							<option value="${j.id}" >${j.country} </option>
						</c:if>
					</c:forEach>
				
				</select><br><br>
				<input type="submit" value="update">
				
			
			</form>
	
		
		</c:forEach>
	
	
</body>
</html>