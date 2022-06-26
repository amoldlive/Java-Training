<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h5>
		Login Failed For User -
		
		<%
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie : cookies) {
				if(cookie.getName().equalsIgnoreCase("userId")){
					out.print(cookie.getValue());
				}
			}
			%>
	
	</h5>
	<a href='loginv3.jsp'> login here </a>
	<hr>

</body>
</html>