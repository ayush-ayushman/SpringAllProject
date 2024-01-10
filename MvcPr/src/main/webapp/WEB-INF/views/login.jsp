<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
form {
	text-align: center;
	border-style: solid;
}
</style>
</head>
<body>
	<form action="validate">
		<label>User name</label><br> <input type="text" name="email"
			placeholder="enter email id" required="required"><br> <label>Password</label><br>
		<input type="password" name="password" placeholder="enter password"
			required="required"><br> <input type="submit"
			value="login">

	</form>

	<!-- THE BELOW SCRIPLET TAG DOES not support nested statements that is why we used different expression to print invalid credentials and closed the { in different scriplet tag  -->
	<%
	String result = (String) request.getAttribute("name");
	if (result != null && result.equals("invalid credentials")) {
	%>
	<%="INVALID CREDENTIALS"%>
	<%
	}
	%>
</body>
</html>