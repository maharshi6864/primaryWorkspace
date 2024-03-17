	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form page</title>
</head>
<body>
	<form action="Form_Response.jsp">
	FIRST NAME : <input type="text" value="" name="fn"> <br><br>
    LAST NAME : <input type="text" value="" name="ln"> <br><br>
    CITY:
		<select name="city">
			<option>Ahemdabad</option>
			<option>Surat</option>
			<option>Rajkot</option>
		</select>  <br> <br>
	GENDER:
	
		<input type="radio" name="gender" value="male">Male
		<input type="radio" name="gender" value="female">Female
		<br> <br>
	HOBBIES:
		<input type="checkbox" name="hobb" value="Gaming">Gaming
		<input type="checkbox" name="hobb" value="Dancing">Dancing
		<input type="checkbox" name="hobb" value="Singing">Singing
		<input type="checkbox" name="hobb" value="Eating">Eating
		<br><br>
	ADDRESS:
		<textarea name="address"></textarea>
	<br> <br>
    <input type="submit" value="submit">
    </form>
</body>
</html>