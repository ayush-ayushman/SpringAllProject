<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Registration Page</title>
<style type="text/css">
div {
	border: 1px solid;
	text-align: center;
	font-family: sans-serif;
}

input, select {
	margin-bottom: 15px;
}
</style>
</head>
<body>
	<div>
		<h1>Car Registration Page</h1>
		<form action="save">
			<label>Manufacture Name</label><br> <input type="text"
				name="manu"></input><br> <label>Car Name</label><br> <input
				type="text" name="cname"><br> <label>Car Type</label> <select
				name="cartype" id="type">
				<option value="hatchback">Hatchback</option>
				<option value="suv">Suv</option>
				<option value="muv">MUV</option>
				<option value="mpv">MPV</option>
			</select> </br> <label>Engine Capacity</label><br> <input type="text"
				name="eng"><br> <label>Cylinders</label> <select
				name="cylinder" id="cylinder">
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">8</option>

			</select> <br> <label>Horse Power</label></br> <input type="text" name="hp"><br>
			<label>Torque</label><br> <input type="text" name="tor"><br>
			<label>Image Url</label> <input type="text" name="url"><br>
			<label>Engine Capacity</label><br> <input type="text" name="eng"><br>
			<label>Seating Capacity</label> <select name="seatcap" id="seat">
				<option value="5">5</option>
				<option value="7">7</option>
				<option value="8">8</option>
			</select> <br> <label>Boot Capacity</label> <input type="text"
				name="boot"><br> <input type="submit" value="save">
		</form>
	</div>
</body>
</html>