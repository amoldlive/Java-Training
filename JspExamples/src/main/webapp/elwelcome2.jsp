<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<H1>Welcome to myapp</H1>
	<hr>
	<h2>Hello - ${param.uid}</h2>
	<h2>CollageName : ${sessionScope.collagename}</h2>
	<h2>CityName : ${cookie.cityname.value}</h2>
</body>
</html>