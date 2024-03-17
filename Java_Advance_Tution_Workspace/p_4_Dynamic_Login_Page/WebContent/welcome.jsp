<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello
	<%
		String Fn=(String)session.getAttribute("firstName");
		String Ln=(String)session.getAttribute("lastName");
		%><br><%
		out.print(Fn);
		%><br><%
		out.print(Ln);		
	
	
	%>
</body>
</html>