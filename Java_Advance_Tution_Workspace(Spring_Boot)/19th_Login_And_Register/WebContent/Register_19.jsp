<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save_19.jsp">
	<label for="firstName">First Name:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="..."
                  aria-label="First name"
                  id="firstName"
                  name="fn"
                /><br><br>
                 <label for="lastname">LastName:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="..."
                  aria-label="Last name"
                  name="ln"
                /><br><br>
	 <label for="firstName">UserName:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="..."
                  aria-label="First name"
                  id="firstName"
                  name="username"
                /><br><br>
                <label for="Password">Password:</label>
                <input
                  type="password"
                  class="form-control"
                  placeholder="***"
                  aria-label="Last name"\
                  name="password"
                /><br><br>
                <button type="submit" class="btn btn-dark">Save</button>
                </form>
</body>
</html>