<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<h1>Welcome to JSP Training</h1>
	<hr>
	<form action="elwelcome.jsp">
		<%
			session.setAttribute("collagename", "Softronix");

			response.addCookie(new Cookie("cityname","Nagpur"));
		%>
		Enter Name : <input type="text" name="uid"> 
		<input type="submit" value="click me">
	</form>
</body>
</html>