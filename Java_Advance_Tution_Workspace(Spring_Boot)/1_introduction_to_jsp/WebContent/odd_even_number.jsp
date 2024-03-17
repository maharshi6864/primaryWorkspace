<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><table border="1px solid">
	<%
		for(int i=0;i<=10;i++){
			if(i%2==0){
				%><tr style="border: 1px solid red"><td><%out.print(i); %></td></tr><%
			}
			else{
				%><tr style="border: 1px solid blue"><td><%out.print(i); %></td></tr><%
			}
		}	//one of the implicit object of jsp is "out"
	%>
	</table>
</body>
</html>