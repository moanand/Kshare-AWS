<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration success Page</title>
</head>
<body>
	<p align="center">You are registered successfully</p>
	<p>Your details are :</p>
	Name : ${userRegInfo.name }
	<br> User Name : ${userRegInfo.userName }
	<br> Password : ${userRegInfo.password }
	<br> Country : ${userRegInfo.countryName }
	<br> Hobbies :
	<c:forEach var="temp" items="${userRegInfo.hobbies}">
	${temp }
	</c:forEach>
	<br> Gender : ${userRegInfo.gender }
	<br> Email : ${userRegInfo.communicationDTO.email }
	<br> Phone : ${userRegInfo.communicationDTO.phone }
</body>
</html>