<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Upload Image</title>
</head>
<body>
	<div class="container p-5" >
		<h1>Upload Image</h1>
	</div>
	<form action="uploadimage" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<label for="exampleFormControlFile1">Select your file</label> <input
				type="file" name="profile" class="form-control-file" id="exampleFormControlFile1">
		</div>
		<button class="btm btn-outline-success">Upload</button>
	</form>

</body>