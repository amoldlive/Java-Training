<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
		<%
			String userId=request.getParameter("uid");
			out.print("Welcome - "+userId);
		%>
		<hr>
		<%
			String driverName=config.getInitParameter("drivername");
			out.print("Driver Name : "+driverName);
		%>
		<hr>
		<%
			String collagename=application.getInitParameter("collagename");
			out.print("collage Name : "+collagename);
		%>
</body>
</html>