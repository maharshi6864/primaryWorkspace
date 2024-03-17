

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="Rg" method="post">
			First name:<input type="text" name="firstname"> <br> <br>
			Last name :<input type="text" name="lastname"> <br> <br>
			User name:<input type="text" name="username"> <br> <br>
			Password :<input type="text" name="password"> <br> <br>
			<input type="hidden" value="insert" name="flag"> <input
				type="submit" value="register">

		</form>
		
		<br> <a href="Rg?flag=search">Click here to search</a>



	</div>
</body>
</html>