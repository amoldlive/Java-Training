<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("uid");
		out.print("Hello "+name);
	%>
	<br/>
	<h1> Welcome to MyApp </h1>
	<Hr/>
</body>
</html>