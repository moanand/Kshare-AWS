<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Page</title>
</head>
<body>
	<p align=right>
		<a href="#">Logout</a>
	</p>
	<form:form>
		<h3>Hi ${userName}!</h3>
		<h3 align="center">Email successfully sent to ${email.userEmail}</h3>

		<br>
		<p>
			<a href="#">Try with somebody else</a>
		</p>

	</form:form>
</body>
</html>