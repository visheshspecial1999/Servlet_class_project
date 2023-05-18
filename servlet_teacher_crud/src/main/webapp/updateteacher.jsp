<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<h3>welcome to e-teacher update portal</h3>
<form action="updation">
<label>teacherId: </label>
<input type="text" name="id" placeholder="enter teacherId"/><br><br>
<label>teacherName: </label>
<input type="text" name="name" placeholder="enter teacherName"/><br><br>
<label>teacherEmail: </label>
<input type="text" name="email" placeholder="enter teacherEmail"/><br><br>
<label>teacherPhone: </label>
<input type="text" name="phone" placeholder="enter teacherPhone"/><br><br>
<label>teacherAddress: </label>
<input type="text" name="Address" placeholder="enter teacherAddress"/>
<input type="submit" value="update">&nbsp; &nbsp; &nbsp;
<a href="index.jsp">Back</a>
</form></body>
</html>