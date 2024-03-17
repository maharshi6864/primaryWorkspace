<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Verify.jsp">
    USERNAME : <input type="text" value="" name="us"> <br><br>
    PASSWORD : <input type="text" value="" name="pa"> <br><br>
    <input type="submit" value="submit">
	<%
	String Firstname=(String)request.getParameter("fn");
	String Lastname=(String)request.getParameter("ln");
	String Username=(String)request.getParameter("user");
	String Password=(String)request.getParameter("pass");
	String error=(String)session.getAttribute("error");
	if(error!=null){
		out.println(error);
		session.removeAttribute("error");
	}
	if(Firstname!=null && Lastname !=null && Username!=null&&Password!=null){
		out.print(Firstname);
		session.setAttribute("firstName", Firstname);
		out.print(Lastname);
		session.setAttribute("lastname", Lastname);
		out.print(Username);
		session.setAttribute("username", Username);
		out.print(Password);
		session.setAttribute("password", Password);
	}
	%>
	</form>
</body>
</html>