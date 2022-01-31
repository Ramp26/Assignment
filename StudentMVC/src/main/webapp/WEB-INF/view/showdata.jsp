<%@page import="com.te.student.bean.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="navbar.jsp"></jsp:include>
    <%
String msg = (String) request.getAttribute("msg");
 StudentDetails details=(StudentDetails) request.getAttribute("data");%>
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
	if (msg!= null && !msg.isEmpty()) {
	%>
	<h4 style="color: red"><%=msg%></h4>
	<%
	}
	%>

	<form action="./show" method="post">
		<label>Enter the rollno:</label> 
		<input type="number" name="rollno">
		<input type="submit" value="Details">
	</form>
	<br>
	<br>
	<%
	if (details!= null) {
	%>
	<h4 >Your Id is: <%=details.getRollno()%></h4>
	<h4 >Your Name is: <%=details.getName()%></h4>
	<h4 >Your Address is: <%=details.getPhoneno()%></h4>
	<h4 >Your Password is: <%=details.getAddress()%></h4>
	<%
	}
	%>
</body>
</html>