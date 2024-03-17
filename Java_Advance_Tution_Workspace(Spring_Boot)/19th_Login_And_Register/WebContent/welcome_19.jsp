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
		String username=(String)session.getAttribute("username");
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("SELECT * FROM register_2 WHERE username='"+username+"'");
	String firstname="";
	String lastname="";
	int id=0;
	while(r.next()){
		id=r.getInt("id");
		firstname=r.getString("firstname");
		lastname=r.getString("lastname");
	}
	
	
	
	
	
	%>
	<h1>WELCOME</h1>
	<%System.out.print(firstname+"   "+lastname); %>
	<button><a
			href="ch_psd_page_19.jsp?id=<%=id%>">Change Password</a></button>
			<button>
</body>
</html>