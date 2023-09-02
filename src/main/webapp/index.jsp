<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success!</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1> Employee Registration Page</h1>
<div class="form">
<%@page import="java.sql.*,java.util.*"%>
<form action="<%= request.getContextPath() %>/EmployeeServlet" method="post">
 	
 	  <table style="with: 100%">
    <tr>
     <td>id :</td>
    <td> <input type="text" name="id"> </td>
</tr>
   
      <tr>
     <td>Name :</td>
	<td> <input type="text" name="fullName"> </td>
	</tr>

      <tr>
     <td>age :</td>
	<td> <input type="text" name="age"></td>
</tr>
   
      <tr>
     <td>gmail id :</td>
	<td> <input type="text" name="gmail_id"></td>
	</tr>
    <tr>
    
     <td>salary :</td>
	<td>  <input type="text" name="salary"></td>
	</tr>
    
      <tr>
     <td>password :</td>
	<td> <input type="text" name="password"></td>
	</tr>
</table>
	<input style="background-color:green;color:white" type="submit" value="register" >
	<input style="background-color:  blue; color:white"><a href="C:\Users\Admin\eclipse-workspace\NewDynamicWeb\src\main\webapp\Update.jsp" style="color:white"> Update info here</a></button>
</form></div>

</body>
</html>