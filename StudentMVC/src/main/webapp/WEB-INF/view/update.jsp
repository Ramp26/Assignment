<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="navbar.jsp"></jsp:include>
    <%
String msg = (String) request.getAttribute("msg");
int details = (int) request.getAttribute("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<h3>Note:Only Your Details Can Be Changed Here</h3>

	<form action="./update" method="post">
		<table>
			<tr>
				<td><label>Roll No:</label></td>
				<td><input type="number" name="rollno" value="<%=details%>"
					disabled="disabled"></td>
			</tr>
			<tr>
				<td><label>Enter Name to Update:</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Enter Address to Update:</label></td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td><label>Enter Password to Update:</label></td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><label>Enter Phone Number to Update:</label></td>
				<td><input type="number" name="phoneno"></td>
			</tr>
		</table>
		<input type="submit" value="Update"> <br>
		<%
		if (msg != null && !msg.isEmpty()) {
		%>
		<h4><%=msg%></h4>
		<%
		}
		%>
		<br> <br>
	</form>

</body>
</html>