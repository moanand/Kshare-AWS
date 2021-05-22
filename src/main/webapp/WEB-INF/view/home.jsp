<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	margin-left: 10px;
	text-align: left;
}
</style>
<script type="text/javascript">
	function onVaidation() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3) {
			alert('Please enter atleast 3 characters');
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<form:form action="process-homepage" modelAttribute="userInfo" onsubmit="return onVaidation()">
		<h1 align="center">Love Calculator</h1>
		<hr>
		<div align="center">
			<p>
				<label for="yn">Your Name : </label>
				<form:input id="yn" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name : </label>
				<form:input id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
			</p>
			<p>
				<form:checkbox id="check" path="acceptTnC" />
				<label>I am agreeing that this is for fun</label>
				<form:errors path="acceptTnC" cssClass="error" />
			</p>

			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>