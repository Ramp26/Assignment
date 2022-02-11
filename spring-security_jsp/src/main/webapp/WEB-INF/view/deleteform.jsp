<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String string = (String) request.getAttribute("msg");
%>
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
	background-image:
		url("https://www.atlantisbioscience.com.sg/home/wp-content/uploads/2017/05/watercolour-texture-background_1048-6656.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>




</head>
<body>

	<nav class="navbar navbar-light bg-light">
		<form class="form-inline" method="post" action="./delete">
			<input class="form-control mr-sm-2" name="id" type="search"
				placeholder="Enter id" aria-label="Search">
			<button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Submit</button>
		</form>
	</nav>
	<h1 align="center" style="color: red;">
		<%
		if (string != null) {
		%>
		<%=string%>

		<%
		}
		%>
	</h1>
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