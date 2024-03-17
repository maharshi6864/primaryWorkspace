<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cal.jsp">
	<input type="text" placeholder="Enter value of A" name="a"><br><br>
	<input type="text" placeholder="Enter value of B" name="b"><br><br>
	<input type="submit" value="Enter">

	</form>
	
	<%
	int c=0;
	if( c!=0){
		 c=(Integer)session.getAttribute("ans");
		//Why there is an error when the server got a restart and after one
		//time run the error got vanish..
		out.print(c);
	}
	%>
</body>
</html>