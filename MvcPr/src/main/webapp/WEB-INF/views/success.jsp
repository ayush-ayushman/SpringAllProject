<%@page import="com.ty.app.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table,tr,td{
border: 1px solid black; 
border-collapse: collapse;
border-style: solid;

}
</style>
</head>
<body>
	<%
	User user = (User) request.getAttribute("user");
	%>

	<table>
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Email</td>
				<td>PhoneNumber</td>
				<td>Password</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<!-- Expression Tag of JSP -->
				<td><%=user.getFirstName()%></td>
				<td><%=user.getLastName()%></td>
				<td><%=user.getEmail()%></td>
				<td><%=user.getPhoneNumber()%></td>
				<td><%=user.getPassword()%></td>
			</tr>
		</tbody>
	</table>
	<a href="success">login page</a>

</body>
</html>