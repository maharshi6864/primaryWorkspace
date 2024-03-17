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
		String fn=request.getParameter("firstname");
		String ln=request.getParameter("lastname");
		String add=request.getParameter("address");
		String city=request.getParameter("city");
		String gender=request.getParameter("gender");
		String[] hobbies=request.getParameterValues("hobbies");
		String user=request.getParameter("username");
	//	String user=request.getParameter("password");
		session.setAttribute("firstname", fn);
		session.setAttribute("lastname",ln);
		session.setAttribute("username",user);
//		session.setAttribute("password",pass);
		%>
		<table border="1px solid">
			<tr style="border:red"><td><b>Firstname </b></td><td><%out.print(fn);%></td></tr>
			<tr style="border:red"><td><b>Lastname </b></td><td><%out.print(ln);%></td></tr>
			<tr style="border:red"><td><b>Address</b></td><td><%out.print(add);%></td></tr>
			<tr style="border:red"><td><b>city </b></td><td><%out.print(city);%></td></tr>
			<tr style="border:red"><td><b>gender </b></td><td><%out.print(gender);%></td></tr>
			<tr style="border:red"><td><b>hobbies </b></td><td><%if(hobbies!=null){for(String hobb:hobbies){
			out.print(hobb);}}%></td></tr>
			
					
		</table>
</body>
</html>