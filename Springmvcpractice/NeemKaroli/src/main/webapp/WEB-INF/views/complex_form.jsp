<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Complex Form</title>
  </head>
  
  <body style="background:#e2e2e2">
	
	<div class="container mx-auto">
		<div class="form-group text-center">
		<label for="exampleFormControlTextarea1">Complex Form</label>
	</div>
	<form action="handleform" method="post">
		<div class="form-group">
			<label for="exampleFormControlInput1">Your Name</label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter Name" name="username">
		</div>
		
		<div class="form-group">
			<label for="exampleFormControlInput1">Your Id</label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Enter Id" name="userid">
		</div>
		
		<div class="form-group">
			<label for="exampleFormControlInput1">Your DOB</label> <input
				type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="dd/mm/yyyy" name="userdob">
		</div>
		
		<div class="form-group">
			<label for="exampleFormControlSelect2">Select Courses</label> <select multiple class="form-control"
				id="exampleFormControlSelect2" name="courses">
				<option>Java</option>
				<option>Python</option>
				<option>C++</option>
				<option>Django</option>
			</select>
		</div>
		
		<label for="formGroupExampleInput">Select Gender</label>
		
		<div class="form-check form-check-inline" >
			<input class="form-check-input" type="radio"
				 id="inlineRadio1" value="Male" name="gender">
			<label class="form-check-label" for="inlineRadio1">Male</label>
		</div>
		<div class="form-check form-check-inline">
			<input class="form-check-input" type="radio"
				 id="inlineRadio2" value="Female" name="gender">
			<label class="form-check-label" for="inlineRadio2">Female</label>
		</div>

		<div class="form-group">
			<label for="exampleFormControlSelect1">Select Type</label> <select
				class="form-control" id="exampleFormControlSelect1" name="type">
				<option>Old Student</option>
				<option>Normal Student</option>
			</select>
		</div>
		
		<div class="container text-center">
				<button type="submit" class="btn btn-success">Sign Up</button>
			</div>
	</form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>