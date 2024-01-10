
<%@page import="com.ty.app.entities.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER DATA</title>
</head>
<body>

	<%
	Object object = application.getAttribute("name");

	List<Customer> listOfCust = (List<Customer>) object;
	%>

	<table>
		<thead>
			<tr>
				<td>Customer Id</td>
				<td>Customer Name</td>
				<td>Customer Address</td>
				<td>Customer RR Number</td>
				<td>Customer UnitConsume</td>
				<td>Bill Amount</td>
				<td>updateBill</td>



			</tr>
		</thead>
		<tbody>
		<%
		for (Customer ca2 : listOfCust) {
		%>
		<tr>
			<td><%=ca2.getCustomerId()%></td>
			<td><%=ca2.getCaddress()%></td>
			<td><%=ca2.getCustomerNamee()%></td>
			<td><%=ca2.getRrnumber()%></td>
			<td><%=ca2.getUnitConsumed()%></td>
			<td><%=ca2.getBillAmount()%></td>
			<% String rrno = ca2.getRrnumber();
				
				%>
				<td><a href="update?rrno=<%=rrno %>">Update  Bill</a></td>
		<tr>



			<%
			}
			%>
		
		</tbody>
	</table>
</body>
</html>