
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Form here</title>
<link href="<c:url value="/resources/css/style.css"/>" />
<script src="<c:url value="/resources/js/script.js"/>" />
</head>
<div class="alert alert-danger" role="alert">
	This is a danger alert—check it out!>
	<form:errors path="user.*">


	</form:errors>
</div>
<body>
	<form action="hello">
	<img alt="my image" src="<c:url value="/resources/image/app.png"/>"/>

		<p>
			<label>Name <input type="text" name="customername" required>
			</label>
		</p>

		<p>
			<label>Phone <input type="tel" name="phonenumber">
			</label>
		</p>

		<p>
			<label>Email <input type="email" name="emailaddress">
			</label>
		</p>

		<fieldset>
			<legend>Which taxi do you require</legend>
			<p>
				<label> <input type="radio" name="taxi" required value="car">
					Car
				</label>
			</p>
			<p>
				<label> <input type="radio" name="taxi" required value="van">
					Van
				</label>
			</p>
			<p>
				<label> <input type="radio" name="taxi" required
					value="tuktuk"> Tuk Tuk
				</label>
			</p>
		</fieldset>

		<fieldset>
			<legend>Extras</legend>
			<p>
				<label> <input type="checkbox" name="extras" value="baby">
					Baby Seat
				</label>
			</p>
			<p>
				<label> <input type="checkbox" name="extras"
					value="wheelchair"> Wheel chair Access
				</label>
			</p>
			<p>
				<label> <input type="checkbox" name="extras" value="tip">
					Stock Tip
				</label>
			</p>
		</fieldset>

		<fieldset>
			<legend>Address</legend>
			<p>
				<label> <input type="text" name="address.paddress">Person
					Addresss
				</label>
			</p>
			<p>
				<label> <input type="text" name="address.pname">Person
					Name
				</label>
			</p>
			<p>
				<label> <input type="text" name="address.pcity">Person
					City
				</label>
			</p>
		</fieldset>
		<p>
			<label>Pickup Date <input type="datetime-local"
				name="pickupdate" />
			</label>
		</p>

		<p>
			<label>Pickup Place <select id="pickup_place"
				name="pickupplace">
					<option value="" selected="selected">Select One</option>
					<option value="office">Taxi Office</option>
					<option value="town_hall">Town Hall</option>
					<option value="telepathy">We'll Guess!</option>
			</select>
			</label>
		</p>

		<p>
			<label>Dropoff Place <input type="text" name="dropoffplace" />
			</label>

			<datalist id="destinations">
				<option value="Airport">
				<option value="Beach">
				<option value="Fred Flinstone's House">
			</datalist>
		</p>

		<p>
			<label>Comment <textarea name="comment" maxlength="500"></textarea>
			</label>
		</p>

		<p>
			<button>Submit Booking</button>
		</p>

	</form>

</body>
</html>