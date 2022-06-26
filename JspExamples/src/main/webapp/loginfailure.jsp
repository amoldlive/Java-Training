<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%session.invalidate(); %>
	<h3>Login Failed | use correct user Id and Password !</h3>
	<%@include file="MyApp.jsp" %>
</body>
</html>