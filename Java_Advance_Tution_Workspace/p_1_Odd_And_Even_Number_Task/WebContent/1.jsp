<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a table</title>
</head>
<body>
	<table border="1px soild black">
	
		<%
			for(int i=0;i<100;i++){
				if(i%2==0){
				%><tr style="border:blue;"><td><%out.print(i);%></td></tr><%
				
			}
				else{
					%><tr style="border:red; "><td><%out.print(i);%></td></tr><%
				}
		
			}
		%>
	
	
	
	</table>
</body>
</html>