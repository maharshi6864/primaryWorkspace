<%@page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="pack.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
	
		abc a1=new abc();
		a1.a=10;
		a1.b=90;
		int A=a1.s1();
		int B=a1.s2();
		out.print(A);
		out.print(B);
	
	%>
</body>
</html>