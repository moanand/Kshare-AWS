<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<p align="right">
		<a href="#">Logout</a>
	</p>
	<h3>Love calculator predicts :</h3>
	<p>${userInfo.userName} and ${userInfo.crushName} :</p>
	FRIEND
	<br>
	<div>
		<p align="left">
			<a href="${pageContext.request.contextPath}/send-email">Send
				result to email</a><br> <a href="#">Try with somebody else</a><br>
			<a href="#">Check user history</a>
		</p>
	</div>
</body>
</html>