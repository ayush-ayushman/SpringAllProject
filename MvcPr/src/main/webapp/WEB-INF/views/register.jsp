<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
   div{
   		margin-top: 100px;
        margin-left: 500px;
   		background-color: #ddd;
 		text-align: center;
 		border-style: solid;
 		border-radius: 25px;
 		height: 500px; 
 		width:500px; 
 		
 		 
 		box-sizing: border-box;
 }  
 input{
 padding-bottom: 5px;
 }
 
</style>
</head>
<body>
	<form action="saveuser">
		<div class="container">
			<label>First Name</label><br> <input type="text" name="fname"
				placeholder="enter first name" required="required"><br>

			<label>Last Name</label><br> <input type="text" name="lname"
				placeholder="enter last name" required="required"><br>
			<label>Email</label><br> <input type="email" name="email"
				placeholder="enter email id" required="required"><br> <label>Password</label><br>
			<input type="password" name="password" placeholder="enter password"
				required="required"><br> <label>Phone Number</label><br>
			<input type="text" name="phone" placeholder="enter phone number"
				required="required"><br> <input type="submit"
				value="register">
		</div>
	</form>

</body>
</html>