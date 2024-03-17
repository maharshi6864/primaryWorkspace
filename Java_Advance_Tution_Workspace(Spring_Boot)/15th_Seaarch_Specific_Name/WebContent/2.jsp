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
	/*String fn=request.getParameter("fn");	
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("SELECT * FROM form WHERE fn='"+fn+"'");
	
	while(r.next()){
		String fnn=r.getString("fn");
		
		out.print(fnn);
	}*/
	String fn=request.getParameter("fn");	
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("SELECT * FROM form WHERE fn like '"+fn+"%'");
	%><table  border="1px solid black" height="100px" width="50px"><%
	while(r.next()){
		int id=r.getInt("id");
		String fnn=r.getString("fn");
		String ln=r.getString("ln");
		String gend=r.getString("gender");
		String addr=r.getString("address");
		String h=r.getString("hobbies");
		
		%><td style="border-color:  ;"><%out.print(id);%></td>
		<td style="border-color:  ;"><%out.print(fnn);%></td>
		<td style="border-color: ;"><%out.print(ln);%></td>
		<td style="border-color: ;"><%out.print(gend);%></td>
		<td style="border-color: ;"><%out.print(addr);%></td>
		<td style="border-color: ;"><%out.print(h);%></td>

		 </tr><%
	}
	
	
	
	
	%>
</body>
</html>