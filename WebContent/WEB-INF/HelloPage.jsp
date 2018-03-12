<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC program</title>
</head>
<h1>${msg}</h1>


<body>

	<form action="/SpringMvc/submission.html" method="post">

		Full Name: <input type="text" name="name"> <br /> 
		contact Number: <input type="text" name="number" /><br />
		DOB: <input type="text" name="DOB" /><br />
		City: <input type="text" name="adress.City" /><br />
		Zip Code: <input type="text" name="adress.Zipcode" /><br />
		
		
		 <input type="submit" value="Submit" />

	</form>


</body>
</html>