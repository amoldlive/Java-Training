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
	<h3>You Are Successfully logged Out !</h3>
	<%@include file="MyApp.jsp" %>
</body>
</html>