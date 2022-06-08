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
	<h5>
		<%
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if(cookie.getName().equalsIgnoreCase("userId")){
				out.print("Hello - "+cookie.getValue());
			}
		}
		%>
	</h5>
	<hr>

</body>
</html>