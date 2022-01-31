<%@page import="java.util.List"%>
<%@page import="com.te.student.bean.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="navbar.jsp"></jsp:include>

<%
List<StudentDetails> data = (List<StudentDetails>) request.getAttribute("data");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<br>
<br>
<body>

	<h1>Employee Details</h1>
	<br>
	<br>
	<table>
		<tr>
			<th>Rollno</th>
			<th>Name</th>
			<th>Address</th>
			<th>Password</th>
			<th>PhoneNumber</th>

		</tr>
		<%
		for (StudentDetails list : data) {
		%>
		<tr>
			<td><%=list.getRollno()%></td>
			<td><%=list.getName()%></td>
			<td><%=list.getAddress()%></td>
			<td><%=list.getPassword()%></td>
			<td><%=list.getPhoneno()%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>