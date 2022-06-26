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
		<h2>Login failure for <%=request.getAttribute("userId") %></h2>
		<h4>Please use valid userId and password to login</h4>
		<%@ include file="login.jsp" %> 	
</body>
</html>