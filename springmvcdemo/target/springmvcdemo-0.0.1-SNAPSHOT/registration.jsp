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
		user id		<input type="text" name="uid"> <br><br>
		password	 <input type="text" name="pswd"><br><br>
		confirm password <input type="text" name="cpswd"><br><br>
		<input type="submit">	
	</form>
	
</body>
</html>