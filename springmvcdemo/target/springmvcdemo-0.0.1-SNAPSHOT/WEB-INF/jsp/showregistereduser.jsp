<%@page import="com.myapp.model.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Users</title>
</head>
<body>
	<h2>MyApp Application</h2>
	<h5>
		Hello
		<%=session.getAttribute("userId")%>
		<span style="float: right;">Login Time <%=new Date()%></span>
	</h5>
	<span style="float: right; font-style: oblique; font-weight: bold;"><a
		href="index.jsp">Logout</a> </span>
	<br>
	<hr>
	<h3>User Details</h3>
	<div>
		<%
		List<User> userList = (List<User>) request.getAttribute("userList");
		%>
		<table border="1">
			<tr>
				<th>Sr.No</th>
				<th>User Id</th>
				<th>User Password</th>
				<th>User Creation Time</th>
			</tr>
			<%
			for (User user : userList) {
			%>
			<tr>
				<td><%=user.getUserno()%></td>
				<td><%=user.getUserid()%></td>
				<td><%=user.getUserpassword()%></td>
				<td><%=user.getUsercreationdate()%></td>
			</tr>

			<%
			}
			%>
		</table>
	</div>

</body>
</html>