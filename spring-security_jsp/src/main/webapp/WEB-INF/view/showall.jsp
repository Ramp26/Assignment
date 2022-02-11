<%@page import="com.te.springsecurity.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% List<User> list=(List<User>) request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
	
			<style type="text/css">
body {
	background-image:url("https://image.shutterstock.com/image-illustration/abstract-watercolor-background-handdrawn-on-260nw-1286150962.jpg");
		background-repeat: no-repeat;
		background-size: cover;
}
</style>
	
	
	
</head>
<body>
<%if(list!=null && !list.isEmpty()){ %>
<table class="table table-striped table-dark">
 <tr>
      <th scope="col">User Id</th>
      <th scope="col">UserName</th>
      <th scope="col">Password</th>
      <th scope="col"> UserRole</th>
    </tr>

<%for(User data: list) {%>
<tr>
<td><%=data.getUserId() %></td>
<td><%=data.getUserName() %></td>
<td><%=data.getUserPassword() %></td>
<td><%=data.getUserRole() %></td>

</tr>
<%} %>

</table>
<%} %>


<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
		crossorigin="anonymous"></script>

</body>
</html>