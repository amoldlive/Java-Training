<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<!--expression Tag  -->
	<%="Welcome To JSP"%>

	<hr>

	<%
	int a = 30;
	%>
	<h1 align="center"><%=a%></h1>


	<hr>
	Current Time:
	<%=java.util.Calendar.getInstance().getTime()%>
</body>
</html>