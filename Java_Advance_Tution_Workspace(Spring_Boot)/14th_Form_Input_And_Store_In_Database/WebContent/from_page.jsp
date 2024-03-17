<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save.jsp">
		First Name: <input type="text" name="fn"> <br><br>
		Last Name: <input type="text" name="ln"><br><br>
		Gender : Male<input type="radio" name="gen" value="Male">
		Female<input type="radio" name="gen" value="Female"><br><br>
		Address: <textarea name="add"></textarea><br><br>
		City :<select name="city">
			<option value="Ahmedabad">Ahmedabad</option>
			<option value="Surat">Surat</option>
			<option value="Rajkot">Rajkot</option>
			<option value="Mumbai">Mumbai</option>
		</select><br><br>
		Hobbies :  Dancing<input type="checkbox" name="hob" value="Dancing">
		Cooking<input type="checkbox" name="hob" value="Cooking">
		Eating<input type="checkbox" name="hob" value="Eating"> <br><br>
		<input type="submit" value="submit">
	
	</form>
</body>
</html>