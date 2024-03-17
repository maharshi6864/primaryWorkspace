<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Submitted DATA</h1>
	<%
		String s=request.getParameter("fn");
		out.print("First Name :"+s+" ");%><br><br><%  
		String e=request.getParameter("ln");
		out.print("Last Name :"+e+" ");%><br><br><%  
		String c=request.getParameter("city");
		out.print("City :"+c);%><br><br><%  
		String g=request.getParameter("gender");
		out.print("Gender :"+g);%><br><br><%
		String [] h=request.getParameterValues("hobb");
		if(h!=null){
			out.print("Hobbies :");
		for(String hobb:h){
			out.print(" "+hobb+" ");
		}
		}		
		%><br><br><%
		String a=request.getParameter("address");
		out.print("Address :"+a);
	
	%>
</body>
</html>