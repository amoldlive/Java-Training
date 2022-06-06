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
	<%!int global_Var = 10;%>
	<%="Global Variable : " + global_Var%>

	<Hr>
	<%!public int add(int num1, int num2) {

		return num1 + num2;
	}%>
	
	<%
		int result=add(5,8);
		out.print("Result : "+result);
	%>
</body>
</html>