<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
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
	<!-- <table border="2px" align="center" bgcolor="cyan">
		<tr>
			<th>STUDENT ID</th>
			<th>STUDENT NAME</th>
			<th>STUDENT EMAIL</th>
			<th>STUDENT PASSWORD</th>
			<th>STUDENT AGE</th>
			<th>ACTION</th>
			<th>ACTION</th>
		</tr> -->

	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">StudentName</th>
				<th scope="col">StudentEmail</th>
				<th scope="col">StudentPassword</th>
				<th scope="col">StudentAge</th>
				<th scope="col">ACTION</th>
				<th scope="col">ACTION</th>


			</tr>
		</thead>
		<tbody>

			<tr>
				<%
				List<StudentBean> students = (List<StudentBean>) request.getAttribute("students");
				if (students != null) {
					for (int i = 0; i < students.size(); i++) {
						StudentBean studentBean = students.get(i);
				%>
				<td><%=studentBean.getsId()%></td>
				<td><%=studentBean.getsName()%></td>
				<td><%=studentBean.getsEmail()%></td>
				<td><%=studentBean.getsPassword()%></td>
				<td><%=studentBean.getsAge()%></td>
				<td><a
					href="studentdeletecontroller?sid=<%=studentBean.getsId()%>">Delete</a></td>
				<td><a
					href="studenteditcontroller?sid=<%=studentBean.getsId()%>">Update</a></td>
			</tr>
			<%
			}
			} else {
			out.println("NULL");
			}
			%>
		
	</table>
</body>
</html>