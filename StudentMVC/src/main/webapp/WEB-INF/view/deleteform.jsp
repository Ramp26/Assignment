<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="navbar.jsp"></jsp:include>
<%
String string = (String) request.getAttribute("msg");
%>
<%
String err = (String) request.getAttribute("err");
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
	<%
	if (string != null && !string.isEmpty()) {
	%>
	<p style="color: red"><%=string%></p>
	<%
	}
	%>
	<%
	if (err != null && !err.isEmpty()) {
	%>
	<p style="color: red"><%=err%></p>
	<%
	}
	%>


	<form action="./delete" method="post">
		<table>
			<tr>
				<td><label>Enter Roll No</label></td>
				<td><input type="number" name="rollno"></td>
				<td><input type="submit" value="Delete"></td>

			</tr>


		</table>
	</form>

</body>
</html>