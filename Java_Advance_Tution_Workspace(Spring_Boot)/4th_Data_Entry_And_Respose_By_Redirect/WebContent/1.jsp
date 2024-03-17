<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="2.jsp">
	FIRST NAME : <input type="text" value="" name="fn"> <br><br>
    LAST NAME : <input type="text" value="" name="ln"> <br><br>
    <input type="submit" value="save">
    <%	
		request.setAttribute("a","fn");
    	session.setAttribute("b",3.4f);
    	application.setAttribute("c",89);
    	
    	String s=(String)request.getAttribute("a");
    	Float f=(Float)session.getAttribute("b");
    	Integer i=(Integer)application.getAttribute("c");
    	
    	out.print(s);
    	out.print(i);
    	out.print(f);
    	
    	%><br><br>
    
		</form>
</body>
</html>