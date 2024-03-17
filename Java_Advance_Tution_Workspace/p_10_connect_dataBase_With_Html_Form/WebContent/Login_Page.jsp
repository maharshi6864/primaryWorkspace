<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style1.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
      crossorigin="anonymous"
    ></script>
</head>
<body>
	
	<div class="container">
      <div class="content">
        <h1>Login Here</h1>
        <form action="verify.jsp">
        <div class="apply_box">
          <div class="row">
            <div class="col mt-3">
              <label for="username">UserName:</label>
              <input
                type="text"
                class="form-control"
                placeholder=".  .  .  .  .  .  .  .  .  .  ."
                aria-label="First name"
                id="username"
                name="us"
              />
            </div>
          </div>
          <div class="row">
            <div class="col mt-3">
              <label for="password">Password:</label>
              <input
                type="password"
                class="form-control"
                placeholder="***********"
                aria-label="First name"
                id="firstName"
                name="pa"
              />
            </div>
          </div>
          <div class="row">
            <div class="col mt-3 text-end">
            <button type="button" class="btn btn-dark mt-4 p-2" onclick="document.location='Register.jsp'">Register</button>            
              <button type="submit" class="btn btn-dark mt-4 p-2">Login</button>
            </div>
          </div>
        </div>
        </form>
      </div>
    </div>
</body>
</html>