<%@page import="com.ty.entities.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   List<Customer> con=(List<Customer>)request.getAttribute("customer");
%>
<%
   
%>
<table>
<thead>
<tr>
  <td>First Name</td>
  <td>Last Name</td>
  <td>Phone</td>
  <td>Email</td>
  <td>Address</td>
  <td>Alt Phone</td>
  
</tr>
</thead>
<tbody>
 <% for(Customer car2:con){ %>
    <tr>
    <td><%=car2.getFname()%></td>
    <td><%=car2.getLname()%></td>
    <td><%=car2.getPhone()%></td>
     <td><%=car2.getEmail()%></td>
    <td><%=car2.getAddress()%></td>
    <td><%=car2.getAltphone() %></td>
     
   </tr>
    
    <%} %>
   </tbody>
</table>
</body>
</html>