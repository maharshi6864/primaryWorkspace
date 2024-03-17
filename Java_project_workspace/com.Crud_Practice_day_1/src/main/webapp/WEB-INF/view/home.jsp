<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
      integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="../../assets/style.css" />
    <script src="1.js"></script>
  </head>
  <body>
  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    <div class="container-fluid theme text-light p-3">
      <header>
        <nav class="navbar navbar-expand-lg theme">
          <div class="container-fluid theme">
            <a class="navbar-brand fs-5 theme" href="#"
              >Student Management System</a
            >
            <button
              class="navbar-toggler"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNav"
              aria-controls="navbarNav"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <div class="m-auto align-item-center"></div>
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link active theme" aria-current="page" href="#"
                    >Home</a
                  >
                </li>
                <li class="nav-item">
                  <a class="nav-link active theme" aria-current="page" href="register"
                    >Add Student</a
                  >
                </li>
                <li class="nav-item">
                  <a class="nav-link active theme" aria-current="page" href="#"
                    >Search Student</a
                  >
                </li>
                <li class="nav-item">
                  <button type="button" class="btn theme" onclick="theme()">
                    <i class="fa-solid fa-lightbulb fs-4"></i>
                  </button>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </header>
      <main class="main">
        <div class="row h-100">
          <div
            class="col-12 h-100 border border-light text-center align-item-center p-5 g-5"
          >
             <div class="table-responsive">
              <table class="tabs">
                <caption class="caption-table">
                  Students
                </caption>
                <thead>
                  <tr>
                    <th scope="col">S.R</th>
                    <th scope="col">Unique Id</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Hobbies</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Address</th>
                    <th scope="col">Username</th>
                    <th scope="col">Password</th>
                    <th scope="col">Phone</th>
                    <th scope="col">Action</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach items="${dtoList}" var="i" varStatus="j">
                    <tr>
                      <td>${j.count}</td>
                      <td>${i.uqid}</td>
                      <td>${i.firstname}</td>
                      <td>${i.lastname}</td>
                      <td>${i.gender}</td>
                      <td>
                        <c:forEach items="${i.hobbies}" var="j" varStatus="k">${j},
                        </c:forEach>
                      </td>
                      <td>${i.address}</td>
                      <td>${i.phone}</td>
                      <td>${i.username}</td>
                      <td>${i.password}</td>
                      <td>
                        <a href="delete?id=${i.id}">delete</a
                        ><a href="edit?id=${i.id}">Edit</a>
                      </td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </main>
      <footer class="mt-5" style="height: 40%">
        <div class="card text-center bg-black">
          <div class="card-body">
            <blockquote class="blockquote">
              <p>@ copyrights since 2023</p>
              <footer class="blockquote-footer">
                Build by Maharshi Patel
                <cite title="Source Title">A Student Management </cite>
              </footer>
            </blockquote>
          </div>
        </div>
      </footer>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
