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
	String old_psd=request.getParameter("old_psd");
	String nw_psd=request.getParameter("nw_psd");
	String nw_psd_2=request.getParameter("nw_psd_2");
	//out.print(id);
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
	Statement s=c.createStatement();
	ResultSet r=s.executeQuery("SELECT * FROM register_2 WHERE password='"+old_psd+"'");
	String password="";
	while(r.next()){
		//id=r.getInt("id");
		password=r.getString("password");
	}
	//out.print(password);
	if(password.equals("")){
		out.print("Wrong OLd PASWORD!!!!");
		
	}
	else if(old_psd.equals(password)){
		if(nw_psd.equals(nw_psd_2)){
			s.executeUpdate("UPDATE register_2 SET password = '"+nw_psd+"' WHERE password='"+old_psd+"';");
			response.sendRedirect("Login_Page_19.jsp");
		}
		else{
			out.print("PLS ENTER NEW CONFIRM PASSWORD CORRECTLY");
		}
		
		
	}
	else{
		out.print("Wrong username or passord !!");
	}
	
	
	
	
	%>
</body>
</html>