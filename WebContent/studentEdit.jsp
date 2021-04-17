<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="studentupdatecontroller">
	<input type="hidden" value="${studentBean.sId }" name="sId">
		<table border="2px" align="center" bgcolor="pink">
			<tr>
				<td>STUDENT NAME:</td>
				<td><input type="text" name="txtStudentName"
					value="${studentBean.sName }"></td>
			</tr>
			<tr>
				<td>STUDENT EMAIL:</td>
				<td><input type="text" name="txtStudentEmail"
					value="${studentBean.sEmail }"></td>
			</tr>
			<tr>
				<td>STUDENT PASSWORD:</td>
				<td><input type="password" name="txtStudentPassword"
					value="${studentBean.sPassword }"></td>
			</tr>
			<tr>
				<td>STUDENT Age:</td>
				<td><input type="text" name="txtStudentAge"
					value="${studentBean.sAge }"></td>
			</tr>
			<tr>
				<td><input type="submit" value="SUBMIT"></td>
				<td><input type="reset" value="RESET"></td>

			</tr>


		</table>


	</form>
</body>
</html>

</table>
</form>
</body>
</html>