<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="consum">
			Customer Id:<input type="text" name="cid"> <br></br> Customer
			Name:<input type="text" name="cname"> <br>
			<br> RRnumber:<input type="text" name="crr"> <br></br>
			UnitConsumed:<input type="text" name="cunitconsume"> <br></br>
			Bill Amount:<input type="text" name="cbamount"> <br></br>
			Customer Address:<input type="text" name="caddress"> <br></br>
			<input type="submit" name="Register"> <br></br>

		</form>
	</div>
	<div>
		<%
		String result = (String) request.getAttribute("name");
		if (result != null && result.equals("Admin successfully logged in")) {
		%>
		<%="loggedin successfully"%>
		<%
		}
		%>

	</div>


</body>
</html>