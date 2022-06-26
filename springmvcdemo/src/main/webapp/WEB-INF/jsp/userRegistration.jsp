<%@page import="java.util.Date"%>
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
	<h5>Hello	<%=request.getAttribute("userId")%>		<span style="float:right;">Login Time <%=new Date() %></span></h5>
	<span style="float:right;font-style: oblique;font-weight: bold;"><a href="logout.jsp">Logout</a>	</span>
	<br>
	<hr>
	
</body>
</html>