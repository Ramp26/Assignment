<%@page import="com.te.springsecurity.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
    <% User str= (User)request.getAttribute("msg"); %>
    <%  String  string= (String)request.getAttribute("errmsg"); %>
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
	background-image:url("https://thepuristonline.com/wp-content/uploads/2019/05/samuel-scrimshaw-166751-unsplash-copy-1024x683.jpg");
		background-repeat: no-repeat;
		background-size: cover;
}
</style>
	
	
</head>
<body>

<nav class="navbar navbar-light bg-light" >
  <form class="form-inline" method="post" action="./details">
    <input class="form-control mr-sm-2" name="id" type="search" placeholder="Enter id" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</nav>

<%if(str!=null ){ %>
<table class="table table-striped table-dark">
 <tr>
      <th scope="col">User Id</th>
      <th scope="col">UserName</th>
      <th scope="col">Password</th>
      <th scope="col"> UserRole</th>
    </tr>


<tr>
<td><%=str.getUserId() %></td>
<td><%=str.getUserName() %></td>
<td><%=str.getUserPassword() %></td>
<td><%=str.getUserRole() %></td>

</tr>


</table>
<%} %>

<%if(string!=null &&  !string.isEmpty()) {%>
<h1 align="center" style="color: red;">
<%=string %>
</h1>
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