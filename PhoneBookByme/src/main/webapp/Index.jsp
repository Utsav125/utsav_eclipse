<%@page import="com.entity.User"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.conn.DbConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allcss.jsp" %><!--  it will check bootstap is connected -->
<style type="text/css">
.back-img{
background: url("img/phone.jpg");
width: 100%;
height: 80vh;
background-repeat: no-repeat;
background-size: cover;

}

</style>
</head>
<body>
<%@include file="component/navabar.jsp" %>
 
<div class="container-fluid back-img text-center text-white">
<h1>Welcome to PhoneBook App</h1></div>

<%@include file="component/footer.jsp" %>
 
 </body>
</html>