<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%! 
		String defaultUid="admin";
		String defaultPswd="admin123";
	%>
	<%
	String uid = request.getParameter("uid");
	String pswd = request.getParameter("pswd");
	if(defaultUid.equals(uid) && defaultPswd.equals(pswd)){	
		out.print("Welcome - " + uid);
	}else{
		out.print("Login Failed Please Try again ");
		out.println("<a href='loginv2.jsp'> login here </a>");
	}	
	%>
</body>
</html>