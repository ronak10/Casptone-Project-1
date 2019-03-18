<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="Registration" method="post">
					<table style="with:50">
					<tr>
							<td>First Name</td>
							<td><input type="text" name="first_name"/></td>
							</tr>
							
					<tr>
							<td>Last Name</td>
							<td><input type="text" name="last_name"/></td>
							</tr>
							
					<tr>
							<td>UserName</td>
							<td><input type="text" name="username"/></td>
							</tr>
							
					<tr>
							<td>E-Mail ID</td>
							<td><input type="email" name="emailid"/></td>
							</tr>
							
					<tr>
							<td>Password</td>
							<td><input type="password" name="password"/></td>
							</tr>
							
					<tr>
							<td>Contact No</td>
							<td><input type="text" name="contact"/></td>
							</tr>
							
					<tr>
							<td>Address</td>
							<td><input type="text" name="address"/></td>
							</tr>
							
					<tr>
							<td>ZipCode</td>
							<td><input type="text" name="zipcode"/></td>
							</tr></table>
							<input type="submit" value="Submit"/></form>
</body>
</html>