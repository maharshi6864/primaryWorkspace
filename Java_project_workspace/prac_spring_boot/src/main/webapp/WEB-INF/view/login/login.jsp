<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Insert title here</title>
  </head>
  <body>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
		<f:form  action="insertLogin" method="post" modelAttribute="LoginVo">
			<f:input path="loginId" type="hidden"/>
			<label for="username">Username :  </label><f:input path="username" id="username"/><br>
			<label for="password">Password : </label><f:input path="password" id="password"/><br>
			<input type="submit" value="submit">
		
		</f:form>
		<a href="search">search</a>
  </body>
</html>
