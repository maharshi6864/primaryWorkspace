<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
    <style>
      html,
      body {
        height: 100%;
        width: 100%;
        font-size: 20px;
      }
      .main {
        height: 100%;
        width: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
      }
      table {
        padding: px;
      }
      input {
        width: 150px;
        height: 30px;
        border: 2px solid black;
        padding: 5px;
      }
      tr,
      td {
        text-align: center;
      }
      button {
        width: 275px;
        height: 50px;
        background-color: crimson;
        border: none;
        font-size: 25px;
        cursor: pointer;
      }
      table {
        border: 1px solid black;
      }
    </style>
  </head>
  <%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
  <body>
    <div class="main">
    
      <table cellspacing="10">
        <caption>
          <u
            ><i><h1>Register here</h1></i></u
          >
        </caption>
        <f:form action="insert" method="post" modelAttribute="RegisterVO"  >
        <tr>
          <td>Firstname:</td>
          <td>
          <f:hidden path="id" />
            <f:input
              type="text"
              path="firstname"
              placeholder="Enter your firstname"
            />
          </td>
        </tr>
        <tr>
          <td>Lastname:</td>
          <td>
            <f:input
              type="text"
              path="lastname"
              placeholder="Enter your last name"
            />
          </td>
        </tr>
        <tr>
          <td>Username</td>
          <td>
            <f:input
              type="text"
              path="username"
              placeholder="Enter your username"
            />
          </td>
        </tr>
        <tr>
          <td>Password</td>
          <td>
            <f:input
              type="text"
              path="password"
              placeholder="Enter your pasword"
            />
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <button type="submit">Register</button>
          </td>
        </tr>
        </f:form>
      </table>
      <br />
      <a href="search">TAP THIS LINK TO SEARCH FOR DATA</a>
    </div>
</body>

</html>