<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.app.ContactsManager"%>
<%@page import="org.apache.catalina.ant.SslConnectorCiphersTask"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyApp</title>
</head>
<body>

	<h1>Welcome To My App</h1>
	User - ${sessionScope.uid}  | LoginTime :${sessionScope.loginTime}  	
	<span style="float:right;"> Home		|	About US			|	<a href="logout.jsp">Logout</a>	</span>
	<hr>
	<%
	ContactsManager contactsManager = new ContactsManager();
	Map<String, String> contacts = contactsManager.getContacts();

	Set<Entry<String, String>> entrySet = contacts.entrySet();
	%>
	<table align="center" border="1">
		<tr>
			<th>Contact Name</th>
			<th>Contact Number</th>
		</tr>

		<%
		for (Entry<String, String> entry : entrySet) {
		%>
		<tr>
			<td><%=entry.getKey()%></td>
			<td><%=entry.getValue()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>