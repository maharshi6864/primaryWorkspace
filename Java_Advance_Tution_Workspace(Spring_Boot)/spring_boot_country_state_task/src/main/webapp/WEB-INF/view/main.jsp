<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Insert title here</title>
  </head>
  <style>
    * {
      margin: 0px;
      padding: 0px;
    }

    html,
    body {
      height: 100%;
      width: 100%;
      box-sizing: border-box;
    }

    body {
      background-color: #1d7ce6;
    }

    .container {
      width: 100%;
      height: 100%;
      display: flex;
      align-items: center;
      justify-content: center;
    }

    .main {
      height: 30vh;
      width: 25vw;
      background-color: #fff;
      display: flex;
      align-items: center;
      flex-direction: column;
      border-radius: 20px;
      box-shadow: 0px 0px 29px -3px rgba(0, 0, 0, 0.36);
    }

    .main h2 {
      font-size: 3.5vw;
      margin: 2vh 0px;
    }
    .main hr {
      width: 90%;
      font-size: 4vw;
    }

    .but {
      width: 100%;
      height: 100%;
      display: flex;
      gap: 17px;
    }

    .buttons {
      width: 100%;
      margin: 4vh 0px 5vh 0px;
      display: flex;
      flex-direction: column;
      align-items: center;
      gap: 10px;
    }

    .button {
      background-color: #0a294d;
      color: #fff;
      border: none;
      padding: 1vh 2vw;
      height: 5vh;
      width: 10vw;
      cursor: pointer;
      border-radius: 20px;
      /* margin-right: 2vw; */
    }

    .button:hover {
      box-shadow: 0px 0px 67px 4px rgba(0, 0, 0, 0.36);
      background-color: white;
      color: black;
    }
  </style>

  <body>
    <div class="container">
      <div class="main">
        <h2>Main Menu</h2>
        <hr />
        <div class="but">
          <div class="buttons">
            <a href="addcountry"><button class="button">Add Country</button></a>
            <a href="addstate"><button class="button">Add State</button></a>
          </div>
          <div class="buttons">
            <a href="viewcountry"><button class="button">View Country</button></a>
            <a href="viewstate"><button class="button">View State</button></a>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
