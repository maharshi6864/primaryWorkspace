<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<%
	String uss=request.getParameter("us");
	String paa=request.getParameter("pa");
	session.setAttribute("username", uss);
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("SELECT * FROM register_2 WHERE username='"+uss+"'");
	String username="";
	String password="";
	while(r.next()){
		username=r.getString("username");
		password=r.getString("password");
	}
	if(username.equals("")){
		out.print("Wrong username or passord !!!!");
		response.sendRedirect("Login_Page_19.jsp");
	}
	else if(username.equals(uss)&&password.equals(paa)){
		out.print("hello world");
		response.sendRedirect("welcome_19.jsp");
		
	}
	else{
		out.print("Wrong username or passord !!");
	}
	
	%>
</body>
</html>