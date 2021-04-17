<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="studentregistrationcontroller">
	<table  border="2px" align ="center" bgcolor = "pink">
	<tr>
		<td>STUDENT NAME: </td>
		<td><input type="text" name="txtStudentName"></td>
	</tr>
	<tr>
		<td>STUDENT EMAIL: </td>
		<td><input type="text" name="txtStudentEmail"></td>
	</tr>
	<tr>
		<td>STUDENT PASSWORD: </td>
		<td><input type="password" name="txtStudentPassword"></td>
	</tr>
	<tr>
		<td>STUDENT Age: </td>
		<td><input type="text" name="txtStudentAge"></td>
	</tr>
	<tr>
	<td><input type="submit" value="SUBMIT"></td>
	</tr>
	
	
	</table>


</form> -->
<form action="studentregistrationcontroller">
		<div class="form-group">

			<div class="form-group">
				<label for="exampleInputName1">STUDENT NAME</label> <input
					type="text" class="form-control" id="exampleInputName1"
					placeholder="Name" name="txtStudentName">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">STUDENT Email</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					placeholder="Email" name="txtStudentEmail">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">STUDENT Password</label> <input
					type="Password" class="form-control" id="exampleInputPassword1"
					placeholder="Password" name="txtStudentPassword">
			</div>
			<div class="form-group">
				<label for="exampleInputName1">STUDENT Age</label> <input
					type="text" class="form-control" id="exampleInputAge1"
					placeholder="Age" name="txtStudentAge">
			</div>
			
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>