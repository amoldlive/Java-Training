<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
		<h1>Welcome To My App</h1>
		<h5>Hello - <%=session.getAttribute("userId") %>	</h5>
		<hr>
		
</body>
</html>