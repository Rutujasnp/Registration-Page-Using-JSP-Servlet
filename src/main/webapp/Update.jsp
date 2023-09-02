<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update employee Details</title>
</head>
<body>
<h1>Update your data</h1>
<form action="<%= request.getContextPath()%>/UpdateEmployee" method="post"></form>
<div>
<table style="with: 100%; align:center;">
<tr>
<td>id :</td>
<td><input type="text" name="id"></td>
</tr>
<tr>
<td>Name :</td>
<td><input type="text" name="name"></td>
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
	<input style="background-color:  green;color:white" type="submit" value="update" >
</form>
</div>
</body>
</html>