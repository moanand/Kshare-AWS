<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>
	<h2>Bill Payment Portal</h2>
	<form:form action="generate-bill" method="GET"
		modelAttribute="cardInfo">
		<div>
			<label>Card Number : </label>
			<form:input path="creditCard" />
			<br> <br> <label>Amount : </label>
			<form:input path="amount" />
			<br>
		</div>
		<div>
			<p>
				<input type="submit" value="Pay Bill" />
			</p>
		</div>
	</form:form>

</body>
</html>