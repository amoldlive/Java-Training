<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>MyApp Application</h2>
	<hr>
	<h3>User Registration Form</h3>
	<form action="registeruser" method="post">
		Date Of Birth <input type="date" name="bdate"> <br><br> 
		Gender 
		<select name="gender">
			<option value="male" >Male</option>
			<option value="female">Female</option>
		</select>
			<br><br> 
		Address
			<input type="text" name="address">
			<br>
		<br> City
			<input type="text" name="city">
			<br>
		<br> State
			<input type="text" name="state">
			<br>
		<br> user id
			<input type="text" name="uid">
			<br>
		<br> password
			<input type="password" name="pswd">
		<br>
		<br> confirm password
			<input type="password" name="cpswd">
		<br>
		<br>
			<input type="submit">
	</form>

</body>
</html>