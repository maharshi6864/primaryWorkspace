<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Saving data
	<%
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String add=request.getParameter("address");
		String em=request.getParameter("email");
		String ct=request.getParameter("city");
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		String [] hob=request.getParameterValues("hob");
		String gen=request.getParameter("gen");
		out.print(fn);
		out.print(ln);
		out.print(add);
		out.print(em);
		out.print(ct);
		out.print(user);
		out.print(pass);
		String hb="";
		if(hob!=null){
			for(String h : hob){
				out.print(h);
				hb=hb+","+h;
			}
		}
		out.print(gen);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("INSERT INTO register(firstname,lastname,address,email,city,username,password,hobbies,gender) VALUES('"+fn+"','"+ln+"','"+add+"','"+em+"','"+ct+"','"+user+"','"+pass+"','"+hb+"','"+gen+"')");
		s.close();
		c.close();	
		response.sendRedirect("Login_Page.jsp");
	
	
	
	
	
	
	%>
</body>
</html>