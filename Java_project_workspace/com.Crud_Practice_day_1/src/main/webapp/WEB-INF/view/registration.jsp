<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css"
      integrity="sha512-siarrzI1u3pCqFG2LEzi87McrBmq6Tp7juVsdmGY1Dr8Saw+ZBAzDzrGwX3vgxX1NkioYNCFOVC0GpDPss10zQ=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/brands.min.css"
      integrity="sha512-W/zrbCncQnky/EzL+/AYwTtosvrM+YG/V6piQLSe2HuKS6cmbw89kjYkp3tWFn1dkWV7L1ruvJyKbLz73Vlgfg=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <style>
      body {
        height: 100%;
        width: 100%;
        box-sizing: border-box;
      }
      [class*="but"] {
        background-color: white;
        color: black;
      }
    </style>
    <link rel="stylesheet" href="../../assets/style.css" />
  </head>
  <body>
  <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
                  <a class="nav-link active theme" aria-current="page" href="/"
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
    <div
      class="container-fluid text-light bg-black h-100 w-100"
      style="padding: 10%"
    >
    
      <f:form action="insert" method="post" modelAttribute="student">
        <div class="container-fluid w-75 text-center">
          <div class="row border border-light p-3">
            <h1>Register Student</h1>
          </div>
          <div class="row">
            <div
              class="col-12 font-size-base col-md-4 border border-light p-2 fs-4"
            >
              Unique Id
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:input
                class="form-control bg-transparent text-light"
                type="text"
                path="uqid"
                name="uqid"
                />
            </div>
          </div>
          <div class="row">
            <div
              class="col-12 font-size-base col-md-4 border border-light p-2 fs-4"
            >
              First Name
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:input
                class="bg-transparent form-control border text-center p-2 w-100 rounded text-light"
                type="text"
                path="firstname"
                aria-describedby="passwordHelpInline"
              />
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              Last Name
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:input
                class="bg-transparent text-center form-control p-2 border w-100 rounded text-light"
                type="text"
                path="lastname"
                aria-describedby="passwordHelpInline"
              />
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              Gender
            </div>
            <div class="col-12 col-md-8 border border-light pt-3 pb-3">
              <f:radiobutton
                class="form-check-input"
                value="male"
                path="gender"
                id="male"
              />
              <label class="form-check-label text-light me-2" for="male">
                Male
              </label>
              <f:radiobutton
                class="form-check-input"
                value="female"
                path="gender"
                id="female"
              />
              <label class="form-check-label text-light me-2" for="female">
                Female
              </label>
              <f:radiobutton
                class="form-check-input"
                value="others"
                path="gender"
                id="other"
              />
              <label class="form-check-label text-light m1-2" for="other">
                Other
              </label>
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              Hobbies
            </div>
            <div class="col-12 col-md-8 border border-light pt-3 pb-3">
              <f:checkbox
                class="form-check-input"
                path="hobbies"
                value="cricket"
                id="cricket"
              />
              <label class="form-check-label" for="cricket"> Cricket </label>
              <f:checkbox
                class="form-check-input"
                path="hobbies"
                value="coding"
                id="coding"
              />
              <label class="form-check-label" for="coding"> Coding </label>
              <f:checkbox
                class="form-check-input"
                path="hobbies"
                value="eating"
                id="eating"
              />
              <label class="form-check-label" for="eating"> eating </label>
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              User Name
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:input
                class="bg-transparent form-control text-center p-2 border w-100 rounded text-light"
                type="text"
                path="username"
              />
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              Password
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:password
                class=" form-control bg-transparent text-center p-2 border w-100 rounded text-light"
                path="password"
              />
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              Address
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:textarea
                class="bg-transparent text-center p-2 border w-100 rounded text-light"
                rows="3"
                path="address"
              ></f:textarea>
            </div>
          </div>
          <div class="row">
            <div class="col-12 col-md-4 border border-light p-2 fs-4">
              Phone Number
            </div>
            <div class="col-12 col-md-8 border border-light pt-2 pb-2">
              <f:input
                class="form-control bg-transparent text-center p-2 border w-100 rounded text-light"
                type="tel"
                path="phone"
              />
            </div>
          </div>

          <button type="button" class="btn mt-3 btn-light p-3">
            Previous Page
          </button>
          <f:button type="submit" class="btn mt-3 btn-light p-3">Submit</f:button>
        </div>
      </f:form>
    </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
      crossorigin="anonymous"
    ></script>
  </body>
</html>