<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Insert title here</title>
  </head>
  <body>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>FirstName</th>
          <th>LastName</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${searchList}" var="i">
          <tr>
            <td>${i.id}</td>
            <td>${i.firstName}</td>
            <td>${i.lastName}</td>
            <td>
              <a href="edit?id=${i.id}"><button>Edit</button></a>
            </td>
            <td>
              <a href="delete?id=${i.id}"><button>Delete</button></a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <a href="/"><button>Back</button></a>
  </body>
</html>
