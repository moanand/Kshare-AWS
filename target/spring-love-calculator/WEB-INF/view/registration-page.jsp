<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	margin-left: 10px;
	text-align: left;
}
</style>
</head>
<body>
	<form:form action="register-success" method="get"
		modelAttribute="userRegInfo">
		<h1 align="center">Love Calculator</h1>
		<hr>
		<p align="right">
			<a href="#">Sign in</a>
		</p>
		<div align="center">
			<p>

				<form:label path="name">Name : </form:label>
				<form:input path="name" id="name" />
			</p>
			<p>
				<form:label path="userName">User Name : </form:label>
				<form:input path="userName" id="userName" />
			</p>
			<p>
				<form:label path="password">Password : </form:label>
				<form:password path="password" id="password" />
			</p>
			<p>
				<form:label path="countryName">Country : </form:label>
				<form:select path="countryName">
					<form:option value="India" label="India"></form:option>
					<form:option value="USA" label="United States"></form:option>
					<form:option value="pak" label="Pakistan"></form:option>
					<form:option value="srilanka" label="Sri Lanka"></form:option>
				</form:select>
			</p>
			<p>
				<form:label path="hobbies">Hobby : </form:label>
				Cricket
				<form:checkbox path="hobbies" value="Cricket" />

				Reading
				<form:checkbox path="hobbies" value="Reading" />

				Travel
				<form:checkbox path="hobbies" value="Travel" />

				Programming
				<form:checkbox path="hobbies" value="Programming" />
			</p>
			<p>
				<form:label path="gender">Gender : </form:label>

				Male
				<form:radiobutton path="gender" value="male" />
				Female
				<form:radiobutton path="gender" value="female" />
			</p>
			<p>
				<label>Age : </label>
				<form:input path="age" />
				<form:errors path="age" />

			</p>
			<div align="center">
				<h3>Communication</h3>
				<label>Email : </label>
				<form:input path="communicationDTO.email" />
				<label>Phone : </label>
				<form:input path="communicationDTO.phone" />
			</div>
			<p>
				<input type="submit" value="register" />
			</p>
		</div>
	</form:form>
</body>
</html>