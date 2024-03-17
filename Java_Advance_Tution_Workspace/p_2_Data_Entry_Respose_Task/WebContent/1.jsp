<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Your details here</title>

</head>
<body>
	<form action="2.jsp">
		First Name : <input name="fn" type="text"> <br> <br>
		Last Name : <input name="ln" type="text"> <br> <br>
		City : <select name="ct">
			<option>City</option>
			<option>Ahemdabad</option>
			<option>Surat</option>
			<option>Rajkot</option>	
		</select> <br><br>
		Gender :  
		Male<input type="radio" value="Male" name="gen" >
		Female<input type="radio" value="Female" name="gen" >
		<br><br>
		Hobbies:  
		Dancing<input type="checkbox" value="Dancing" name="hob">
		coding<input type="checkbox" value="coding" name="hob">
		singing<input type="checkbox" value="singing" name="hob">
		<br><br>
		<input type="submit" value="submit">
		
		
		
	</form>
</body>
</html>