<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="verify_19.jsp">
		 <label for="username">UserName:</label>
              <input
                type="text"
                class="form-control"
                placeholder=".  .  .  .  .  .  .  .  .  .  ."
                aria-label="First name"
                id="username"
                name="us"
              />
              <br><br>
              <label for="password">Password:</label>
              <input
                type="password"
                class="form-control"
                placeholder="***********"
                aria-label="First name"
                id="firstName"
                name="pa"
              /><br><br>
              <button type="button" class="btn btn-dark mt-4 p-2" onclick="document.location='Register_19.jsp'">Register</button>
              <br><br>            
              <button type="submit" class="btn btn-dark mt-4 p-2">Login</button>
	
	</form>
</body>
</html>