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
	<form:form action="process-email" method="GET" modelAttribute="emailInfo">
		<h3>
			Hi! ${userName} <br> Send result to your email
		</h3>
		<label>Your email id : </label>
		<form:input path="userEmail" />
		<input type="submit" value="Send" />
		<br>
		<p>
			<a href="#">Try with somebody else</a>
		</p>

	</form:form>
</body>
</html>