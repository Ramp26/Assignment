<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String string=(String)request.getAttribute("err"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/8d9055b1dc.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<style type="text/css">

body{
background-color: #FDF5F6;
}
.myForm{
box-shadow: 3px 2px 3px grey ;
border-bottom-left-radius:5px;
border-top-left-radius:5px;
 
height: 450px;
width:350px !important;

padding: 20px !important;
background-color: white;
}


.header{
background-color: #FF5851;
padding: 20px;
height: 450px;
width:350px !important;
text-align: center;
color: white;
box-shadow: 3px 2px 3px grey ;
border-bottom-right-radius:5px;
border-top-right-radius:5px;

}

.header h1{
margin-top: 50px;
}
.header p{
margin-top: 20px;
margin-bottom: 20px;
}
.icons{
font-size: 25px;
display: flex;
justify-content:space-evenly;
margin-top: 45px;
}
.icons i:hover{
color: black;
}
.container{
display: flex;
align-items: center;
justify-content: center;
margin-top: 100px;


}
.formsEle{
margin-top: 60px;
}
.log{
text-align: center;
}

.fas{
margin-left: 115px;
font-size: 50px;
margin-top: 30px;
}

.btn {
margin-left: 90px !important;
width: 110px;
border-radius: 22px;
}


</style>
</head>
<body>
<%
			if (string != null && !string.isEmpty()) {
			%>
			<p style="color: red"><%=string%></p>
			<%
			}
			%>

<fieldset>
		
		<!-- <form action="./login" method="post"> -->
		
<div class="container">

<div >

		<form action="./login" method="post" class=" w-25 myForm">
		<h2 class="log">LOGIN</h2>
	<i class="fas fa-graduation-cap"></i>
  <div class="form-group formsEle">
  
    <input type="number" class="form-control" placeholder="Student Roll No" id="exampleInputEmail1" name="rollno" aria-describedby="emailHelp">
   
  </div>
  <div class="form-group">
   
    <input type="password"  class="form-control" placeholder="Password" name="password" id="exampleInputPassword1">
  </div>
 
  <button type="submit" class="btn btn-danger mx-auto mt-3">Submit</button>
</form>
</div>


<div class="header" >
<h1>welcome</h1>
<h2>Student login page</h2>
<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed lobortis eu ex suscipit sagittis</p>
<div class="icons">
<i class="fab fa-facebook"></i>
<i class="fab fa-instagram"></i>
<i class="fab fa-twitter"></i>
<i class="fab fa-youtube"></i>
</div>
</div>

</div>
		<!-- 	<table>
				<tr>
	s				<td><label>Student Roll</label> </td>
					<td><input type="number" name="rollno"
						placeholder="Enter RollNo"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td> <input type="password"
						name="password" placeholder="Password"></td>

				</tr>
			</table>
			<input type="submit" value="login">

		</form>  -->


	</fieldset>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>