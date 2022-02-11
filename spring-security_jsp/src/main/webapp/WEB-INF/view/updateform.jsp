<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%  String  string=(String) request.getAttribute("msg"); %>
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
	background-image:url("https://wallpaperbat.com/img/507928-the-letter-computer-wallpaper-desktop-wallpaper-laptop-wallpaper-desktop-wallpaper-aesthetic-desktop-wallpaper.jpg");
		background-repeat: no-repeat;
		background-size: cover;
}
</style>
	
		
	
</head>
<body>

<br> 
<h1 align="center" style="color: blue;">Update Your Information</h1>
<br>

<form action="./update" method="post">

<div class="container">
  <div class="row">
    <div class="col">
      <input type="number" class="form-control" placeholder="User Id" name="userId" >
    </div>
    <div class="col">
      <input type="text" class="form-control" placeholder="User name" name="userName" >
    </div>
  </div>
<br>
<br>
  
  <div class="row">
    <div class="col">
      <input type="Password" class="form-control" placeholder="Password" name="userPassword"  >
    </div>
    <div class="col">
      <select class="form-control" name="userRole" >
       <option value="#"> Select Your Role</option>
      <option value="ROLE_USER"> ROLE_USER</option>
       <option value="ROLE_ADMIN"> ROLE_ADMIN</option>
      
      
      </select>
    </div>
  </div>
  <br>
  <br>
  <button type="submit" value="submit"> submit</button>
  </div>
</form>


<%if(string!=null){ %>
<h1 align="center" style="color: green;" >
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