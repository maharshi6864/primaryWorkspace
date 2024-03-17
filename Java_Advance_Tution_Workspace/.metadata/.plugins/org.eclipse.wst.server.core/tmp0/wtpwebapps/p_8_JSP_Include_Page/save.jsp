<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String add1=request.getParameter("add1r");
		String add2=request.getParameter("add2r");
		String add3=request.getParameter("add1p");
		String add4=request.getParameter("add2p");
		out.println(fn);
		%><br><%
		out.println(ln);
		%><br><%
		out.println(add1);
		%><br><%
		out.println(add2);
		%><br><%
		out.println(add3);
		%><br><%
		out.println(add4);
	
	
	
	%>
</body>
</html>