<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="validate">
		UserName:<input type="text" name="uname">
		 <br></br>
		Password:<input type="text" name="pass"> 
		 <input type="submit" name="login">
		 <br></br>
	</form>
	<%
	String result = (String) request.getAttribute("name");
	if (result != null && result.equals("invalid credentials")) {
	%>
	<%= "INVALID CREDENTIALS" %>
	<%
	}
	%>
</body>
</html>