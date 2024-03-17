<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
      a {
        text-transform: uppercase;
      }
      .heading {
        text-align: center;
        font-size: 30px;
        font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
          "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
      }
      tr,
      th,
      td {
        text-align: center;
      }

      table {
        border: 1px solid black;
        text-decoration: underline;
      }
      .table {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
      }
    </style>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
	 <div class="main">
      <div class="table">
        <table cellspacing="40">
          <tr>
            <td class="heading">ID</td>
            <td class="heading">FirstName</td>
            <td class="heading">lastName</td>
            <td class="heading">Username</td>
            <td class="heading">Password</td>
            <td class="heading">Actions</td>
          </tr>
          <c:forEach items="${registerList}" var="i">
            <tr>
              <td>${i.id}</td>
              <td>${i.firstname}</td>
              <td>${i.lastname}</td>
              <td>${i.username}</td>
              <td>${i.password}</td>
              <td>
                <button>
                  <a
                    style="color: red; text-decoration: none"
                    href="delete?id=${i.id}"
                    >delete</a
                  >
                </button>
                <button>
                  <a
                    style="color: green; text-decoration: none"
                    href="edit?id=${i.id}"
                    >Edit</a
                  >
                </button>
              </td>
            </tr>
          </c:forEach>
        </table>
        <br /><br /><br />
        <a href="/">back to the previous page</a>
      </div>
    </div>
</body>
</html>