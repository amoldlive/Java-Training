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
	
	session.setAttribute("userId", uid);
	
	if(defaultUid.equals(uid) && defaultPswd.equals(pswd)){
		response.sendRedirect("success3.jsp");
	}else{
		response.sendRedirect("failure3.jsp");
	}	
	%>
</body>
</html>