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
	String del=request.getParameter("id");
	out.print(del);

	int dele=Integer.parseInt(del);

Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", "root");
Statement s = c.createStatement();
		ResultSet r = s.executeQuery("SELECT * FROM form WHERE id like '" + dele + "%'");
		%><form action="editIt_1.jsp"><%
	
		
			while (r.next()) {
				int id = r.getInt("id");
				
				String fnn = r.getString("fn");
				String ln = r.getString("ln");
				String gend = r.getString("gender");
				String addr = r.getString("address");
				String h = r.getString("hobbies");%>
				<input type="hidden" name="id" value="<%=r.getString("id")%>">
				First Name: <input type="text" name="fn_edit" value="<%=r.getString("fn")%>"> <br><br>
				Last Name: <input type="text" name="ln_edit" value="<%=r.getString("ln")%>"><br><br>	
					
					
		<%
			}
		
		%>
		<input type="submit" value="edit">
		</table>
		</form>
</body>
</html>