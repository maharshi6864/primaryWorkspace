<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <form action="response_2.jsp">
      Firstname :
      <input type="text" name="firstname" />

      <br />
      <br />

      Lastname :
      <input type="text" name="lastname" />

      <br />
      <br />

      Address :
      <textarea name="address" value="null" cols="30" rows="10"></textarea>

      <br />
      <br />

      City:
      <select name="city" id="">
        <option value="">city</option>
        <option value="Ahemdabad">Ahemdabad</option>
        <option value="Delhi">Delhi</option>
        <option value="Baroda">Baroda</option>
        <option value="Surat">Surat</option>
        <option value="Rajkot">Rajkot</option>
      </select>

      <br />
      <br />

      Gender:

      <br />

      Male: <input type="radio" name="gender" value="male" id="" /> Female:
      <input type="radio" name="gender" value="Female" id="" />

      <br />
      <br />

      hobbies: Coding:<input type="checkbox" name="hobbies" value="coding" />
      Eating:<input type="checkbox" name="hobbies" id="" />

      <br /><br />

      <input type="submit" value="Save" />
</body>
</html>