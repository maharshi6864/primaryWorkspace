<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Verify_Page.jsp">
	Username : <input type="text" name="username"><br><br>
	Password : <input type="password" name="password"><br><br>
	<input  type="submit" value="Login">
	</form>
	<%
 		String fn=request.getParameter("firstname");
	String ln=request.getParameter("lastname");
	String un=request.getParameter("username");
	String pa=request.getParameter("password");
	String error=(String)session.getAttribute("error");
	if(error!=null){	
		out.print(error);
		session.removeAttribute("error");
	}
	if(fn!=null&&ln!=null&&un!=null&&pa!=null){	
	session.setAttribute("firstName", fn);
		session.setAttribute("lastName", ln);
		session.setAttribute("userName",un);
		session.setAttribute("passWord",pa);
	}
	%>
</body>
</html>