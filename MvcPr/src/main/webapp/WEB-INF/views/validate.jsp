<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Admin loggedin</h1>
	<!-- THE BELOW SCRIPLET TAG DOES not support nested statements that is why we used different expression to print invalid credentials and closed the { in different scriplet tag  -->
	<%
	String result = (String) request.getAttribute("name");
	if (result != null && result.equals("Admin successfully logged in")) {
	%>
	<%="loggedin successfully"%>
	<%
	}
	%>
</body>
</html>