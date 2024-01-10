<%@page import="com.ty.app.entities.Customer"%>
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
	Customer cust = (Customer) request.getAttribute("billupdate");
	%>
	<form action="billupdate">
		Customer Id:<input type="text" name="cid" value=<%=cust.getCustomerId() %>> <br></br> Customer
		Name:<input type="text" name="cname" value=<%=cust.getCustomerNamee() %>> <br> <br>
		RRnumber:<input type="text" name="crr" value=<%=cust.getRrnumber()%>> <br></br>
		UnitConsumed:<input type="text" name="cunitconsume" value=<%=cust.getUnitConsumed() %>> <br></br>
		Bill Amount:<input type="text" name="cbamount" value=<%=cust.getBillAmount() %>> <br></br>
		Customer Address:<input type="text" name="caddress" value=<%=cust.getCaddress() %>> <br></br>
		<input type="submit" name="Register"> <br></br>

	</form>
</body>
</html>