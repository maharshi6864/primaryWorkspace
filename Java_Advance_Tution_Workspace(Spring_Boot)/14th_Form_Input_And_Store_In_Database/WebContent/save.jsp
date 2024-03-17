<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String gen=request.getParameter("gen");
		String add=request.getParameter("add");
		String ct=request.getParameter("city");
		out.print(firstname);%><br><% 
		out.print(lastname);%><br><%
		out.print(gen);%><br><%
		out.print(add);%><br><%
		out.print(ct);%><br><%
		String [] hob=request.getParameterValues("hob");
		String hb="";
		if(hob!=null){
			out.print("Hobbies :");
			for (String h:hob){
				out.print(h);%><br><%
				hb=h+","+hb;			
			}
		}	
		out.print(hb);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("INSERT INTO form(fn,ln,gender,address,city,hobbies) VALUES('"+firstname+"','"+lastname+"','"+gen+"','"+add+"','"+ct+"','"+hb+"')");
		ResultSet r=s.executeQuery("SELECT * FROM form");
		%><table  border="1px solid black" height="100px" width="50px"><%
		while(r.next()){
			int id=r.getInt("id");
			String fn=r.getString("fn");
			String ln=r.getString("ln");
			String gend=r.getString("gender");
			String addr=r.getString("address");
			String h=r.getString("hobbies");
			
			%><td style="border-color:  ;"><%out.print(id);%></td>
			<td style="border-color:  ;"><%out.print(fn);%></td>
			<td style="border-color: ;"><%out.print(ln);%></td>
			<td style="border-color: ;"><%out.print(gend);%></td>
			<td style="border-color: ;"><%out.print(addr);%></td>
			<td style="border-color: ;"><%out.print(h);%></td>
	
			 </tr><%
			
			%><br><%
		}
	
	
	%>
</body>
</html>