<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Country</title>
</head> 
<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
    integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
    crossorigin="anonymous"
    referrerpolicy="no-referrer"
  />
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

    .buttons {
      width: 100%;
      margin: 0vh 0px 0vh 0px;
      display: flex;
      justify-content: center;
      align-items: center;
      gap: 7px;
    }

    .button {
      background-color: #0a294d;
      color: #fff;
      border: none;
      padding: 1.5vh 2vw;
      cursor: pointer;
      border-radius: 20px;
      /* margin-right: 2vw; */
    }

    a .button:hover {
      box-shadow: 0px 0px 67px 4px rgba(0, 0, 0, 0.36);
      background-color: white;
      color: black;
    }

    .inp {
      width: 60%;
      height: 3vh;
      border: 0.5px solid black;
      padding: 1vh 2vw;
      cursor: pointer;
      border-radius: 20px;
      margin: 2vh;
    }
  </style>
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
      height: 35vh;
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
      margin: 1vh 0px 5vh 0px;
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
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
  <body>
    <div class="container">
      <div class="main">
        <h2>Add Country</h2>
        <hr />
        <f:form action="insertcountry" method="post" modelAttribute="Country">
	<f:input
          type="text"
          path="country"
          class="inp"
          placeholder="Enter Country Name"
        />
        <div class="buttons">
         
        
          <a href="/"><button class="button" type="button"><i class="fa-solid fa-arrow-left"></i></button></a>
           <button class="button" type="submit">Add Country</button> 
           </f:form>
         
        </div>
      
      </div>
    </div>
  </body>
</html>
