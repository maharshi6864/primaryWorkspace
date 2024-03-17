<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<link rel="stylesheet" href="style.css" />
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
      <form action="save.jsp">
        <h1>Register Here</h1>
        <div class="apply_box">
          <div class="row">
            <div class="row align-items-center">
              <div class="col mt-4">
                <label for="firstName">First Name:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="..."
                  aria-label="First name"
                  id="firstName"
                  name="fn"
                />
              </div>
              <div class="col mt-4">
                <label for="lastname">LastName:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="..."
                  aria-label="Last name"
                  name="ln"
                />
              </div>
            </div>

            <div class="row">
              <div class="col mt-3">
                <label for="floatingTextarea2">Address:</label>
                <textarea
                  class="form-control"
                  placeholder="Leave your residencial..."
                  id="floatingTextarea2"
                  style="height: 100px"
                  name="address"
                ></textarea>
              </div>
            </div>
            <div class="row">
              <div class="col mt-3">
                <label for="">Email:</label>
                <input
                  type="email"
                  class="form-control"
                  id="floatingInput"
                  placeholder="name@example.com"
                  name="email"
                />
              </div>
              <div class="col mt-3">
                <label for="">City:</label>
                <select
                  class="form-select"
                  id="floatingSelect"
                  aria-label="Floating label select example"
                  name="city"
                >
                  <option selected value="">Select City</option>
                  <option value="Ahemdabad">Ahemdabad</option>
                  <option value="Surat">Surat</option>
                  <option value="Mehsana">Mehsana</option>
                </select>
              </div>
            </div>
            <div class="row">
              <div class="col mt-3">
                <label for="firstName">UserName:</label>
                <input
                  type="text"
                  class="form-control"
                  placeholder="..."
                  aria-label="First name"
                  id="firstName"
                  name="username"
                />
              </div>
              <div class="col mt-3">
                <label for="lastname">Password:</label>
                <input
                  type="password"
                  class="form-control"
                  placeholder="***"
                  aria-label="Last name"\
                  name="password"
                />
              </div>
            </div>
            <div class="row">
              <div class="col mt-3">
                <label for="flexCheckDefault">Hobbies:</label>
              </div>
              <div class="col mt-3">
                <label for="flexCheckDefault">Gender:</label>
              </div>
            </div>
            <div class="row">
              <div class="col c1">
                <input
                  class="form-check-input"
                  type="checkbox"
                  value="Dancing"
                  id="flexCheckDefault"
                  name="hob"
                />
                <span class="form-check-label" for="flexCheckDefault">
                  Dancing
                </span>
                <input
                  class="form-check-input"
                  type="checkbox"
                  value="Eating"
                  id="flexCheckDefault"
                  name="hob"
                />
                <span class="form-check-label" for="flexCheckDefault">
                  Eating
                </span>
                <input
                  class="form-check-input"
                  type="checkbox"
                  value="Coding"
                  id="flexCheckDefault"
                  name="hob"
                />
                <span class="form-check-label" for="flexCheckDefault">
                  Coding
                </span>
                <input
                  class="form-check-input"
                  type="checkbox"
                  value="Cooking"
                  id="flexCheckDefault"
                />
                <span class="form-check-label" for="flexCheckDefault">
                  Cooking
                </span>
              </div>

              <div class="col c1">
                <input
                  value="male"
                  class="form-check-input ml-5"
                  type="radio"
                  id="flexRadioDefault1"
                  name="gen"
                />
                <span class="form-check-label" for="flexRadioDefault1">
                  Male
                </span>
                <input
                	value="female"
                  class="form-check-input"
                  type="radio"
                  id="flexRadioDefault1"
                  name="gen"
                />
                <span class="form-check-label" for="flexRadioDefault1">
                  Female
                </span>
              </div>
            </div>
            <div class="row">
              <div class="col mt-3 text-end">
                <button type="submit" class="btn btn-dark">Save</button>
              </div>
            </div>
          </div>
        </div>
        </form>
      </div>
    </div>
</body>
</html>