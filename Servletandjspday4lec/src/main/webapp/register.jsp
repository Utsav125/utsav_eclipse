<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
  <!-- Compiled and minified CSS -- yai hum nai perloder sai li hai  --->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
</head>
<body style="background: url(img/images.jpeg); background-size: cover;background-attachment: fixed">
<div class="container"> 
<div class="row">
<div class="col m6 offset-m3">
<div class="card">
<div class="card-content">

<h3 style="margin-top: 10px" class="center-align">Register here!!</h3>
<div class="form center align">
<!-- Createing a form -->
<form action="Register" method="post">

<input type="text" name="user_name" placeholder="Enter name Here">
<input type="password" name="user_pass" placeholder="Enter Password Here">
<input type="email" name="user_email" placeholder="Enter email Here">

<button type="submit" class="btn">Submit</button>
</form>

</div>

<div class="loader center-align" style="margin-top: 10px; display: none">

    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
    </div>
    
    <h5>Please wailt...</h5>
</div>
</div>
</div>
</div>
</div>
</div>


<script
  src="https://code.jquery.com/jquery-3.7.1.min.js"
  integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
  crossorigin="anonymous"></script>
  
  <script>
  $(document).redy(function () {
	console.log("page is ready...")
})</script>
</body>
</html>