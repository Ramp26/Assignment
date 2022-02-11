<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String str = (String) request.getAttribute("msg");
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
	background-image:url("https://media.istockphoto.com/photos/abstract-watercolor-art-hand-paint-on-white-background-watercolor-picture-id1265282701?b=1&k=20&m=1265282701&s=170667a&w=0&h=AQ2xVhpRIbvV6gFLxY-Nfz9S1y2l9TaoBrvywrca0g4=");
		background-repeat: no-repeat;
		background-size: cover;
}
</style>

</head>
<body>
	


	<nav class="navbar navbar-expand-lg navbar-dark bg-dark    ">
		<a class="navbar-brand" href="./">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item "><a class="nav-link" href="./reg">
						Registration<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="./user">User
						log-in</a></li>
				<li class="nav-item"><a class="nav-link" href="./admin">Admin
						log-in</a></li>



			</ul>
		</div>
	</nav>
	<br>
	
	
	<%
	if (str != null && !str.isEmpty()) {
	%>
	
<h3 align="center" style="color: purple;">
	<%=str%>
	
	</h3>

	<%
	}
	%>
	
	<br>
	
	<div align="center">
		<h1 style="color: blue;">Welcome to home page</h1>
	</div>


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