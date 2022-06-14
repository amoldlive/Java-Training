<%@page import="java.util.ArrayList"%>
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
	<h1>Welcome to Page Directive Test Page</h1>
	<hr>
	<h4>
		Todays Date
		<%=new Date()%>
	</h4>
		<h3>
	<%
		ArrayList<String> cityList=new ArrayList<>();
		cityList.add("Nagpur");
		cityList.add("Delhi");
		
		for(String city:cityList){
			out.println(city+"<br>");
		}
	%>
	<h3>
</body>
</html>