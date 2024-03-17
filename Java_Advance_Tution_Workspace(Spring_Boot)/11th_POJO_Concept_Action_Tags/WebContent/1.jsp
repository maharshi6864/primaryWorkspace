<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="pack.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	
		//abc a1=new abc();
		//a1.setFn("Maharshi");
		//a1.setLn("Patel");
		//String firstname=a1.getFn();
		//String lastname=a1.getLn();
		//out.print(firstname);
		//out.print(lastname);
		
		
	
	
	%>
	<jsp:useBean  class="pack.abc" id="a1" >	</jsp:useBean>
	<jsp:setProperty property="fn" name="a1" value="zenils"/>
	<jsp:setProperty property="ln" name="a1" value="Patel"/>
	<jsp:getProperty property="fn" name="a1"/>
	<jsp:getProperty property="ln" name="a1"/>
	
	
</body>
</html>