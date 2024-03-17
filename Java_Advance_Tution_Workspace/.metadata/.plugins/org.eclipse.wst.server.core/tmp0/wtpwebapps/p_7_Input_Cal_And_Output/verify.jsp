<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="pack.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String a=request.getParameter("a");
		String b=request.getParameter("b");
		int A=Integer.parseInt(a);
		int B=Integer.parseInt(b);
		calculate a1=new calculate();
		a1.a=A;
		a1.b=B;
		int C=a1.s();
		session.setAttribute("ans", C);
		response.sendRedirect("input.jsp");	
	
	%>
</body>
</html>