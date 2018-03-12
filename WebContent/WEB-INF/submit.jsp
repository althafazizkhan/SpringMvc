<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>${msg}</h1>

<body>
<table>
<tr>
<td> Student Name : </td>
<td>${student1.name} </td>
</tr>


<tr>
<td> Student contact number : </td>
<td>${student1.number} </td>
</tr>

<tr>
<td> Student DOB : </td>
<td>${student1.DOB} </td>
</tr>

<tr>
<td> Student City : </td>
<td>${student1.adress.city} </td>
</tr>

<tr>
<td> Student Zipcode  : </td>
<td>${student1.adress.zipcode} </td>
</tr>

</table>

</body>
</html>