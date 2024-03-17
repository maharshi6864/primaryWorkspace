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
		String search=request.getParameter("search");
		session.setAttribute("search",search);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM register WHERE firstname LIKE '"+session.getAttribute("search")+"%'");
		%><table border="1px solid black"><%
		%><tr>
		<td>id</td>
		<td>firstname</td>
		<td>lastname</td>
		<td>address</td>
		<td>email</td>
		<td>city</td>
		<td>username</td>
		<td>password</td>
		<td>hobbies</td>
		<td>gender</td>
		<td>action</td>
		</tr><%
		while(r.next()){
			int id=r.getInt("id");
			String fn=r.getString("firstname");
			String ln=r.getString("lastname");
			String addre=r.getString("address");
			String email=r.getString("email");
			String city=r.getString("city");
			String user=r.getString("username");
			String pass=r.getString("password");
			String hobbies=r.getString("hobbies");
			String gender=r.getString("gender");
			%><tr><%
			%><td><%out.print(id);%></td><%
			%><td><%out.print(fn);%></td><%
			%><td><%out.print(ln);%></td><%
			%><td><%out.print(addre);%></td><%
			%><td><%out.print(email);%></td><%
			%><td><%out.print(city);%></td><%
			%><td><%out.print(user);%></td><%
			%><td><%out.print(pass);%></td><%
			%><td><%out.print(hobbies);%></td><%
			%><td><%out.print(gender);%></td><%
			%><td><button><a
			href="delete_1.jsp?id=<%=r.getInt("id")%>">delete</a></button>
			<button><a
			href="edit_1.jsp?id=<%=r.getInt("id")%>">edit</a></button></td><%
			
		}
		%></table><% 	
	
	%>
</body>
</html>