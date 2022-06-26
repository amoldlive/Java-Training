<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Page App</title>
</head>
<body>
	<%@include file="Header.jsp"%>
	<Hr>
	<%
	out.println("Timestamp : " + new Date());
	%>
	<%@include file="footer.html"%>
</body>
</html>