<%@page import="com.ty.app.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Detail Page</title>
<style type="text/css">
table,tr,td{
border: 1px solid black;
border-collapse: collapse;
}
</style>
</head>
<body>
<!--  Scriptlet tag of jsp  -->
<%
  User user=(User)request.getAttribute("user");
%>
<table>
<thead>
<tr>
  <td>First Name</td>
  <td>Last Name</td>
  <td>Email</td>
  <td>Phone</td>
</tr>
</thead>
<tbody>
 <tr>
   <td><%= user.getFirstName() %></td>
   <td><%= user.getLastName() %></td>
   <td><%= user.getEmail() %></td>
   <td><%= user.getPhone() %></td>
 </tr>
</tbody>
</table>
</body>
</html>