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
		int id=Integer.parseInt(request.getParameter("id"));
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement  s=c.createStatement();
	ResultSet r=s.executeQuery("SELECT * FROM register WHERE id='"+id+"'");
	%><form action="editIt_1.jsp"><%
	while(r.next()){
		
		%><input type="hidden" name="id" value="<%=r.getInt("id")%>"><%
				%><input type="text" name="fn" value="<%=r.getString("firstname")%>"><br><br><%
				%><input type="text" name="ln" value="<%=r.getString("lastname")%>"><br><br><%
				%><input type="submit"  value="Edit"><%
	}
	
	%></form><%	
	
	%>
</body>
</html>