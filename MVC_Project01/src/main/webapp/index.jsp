<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginvlaidation.co.in</title>
</head>
<body bgcolor="lightgreen">
<br><br>
<center>
	<form action="./s01" method="POST" >
	<fieldset>
	<legend>Login Screen</legend>
	<p>Username : </p>
	<input type="text" name="name" required placeholder="Enter Username"/>
	<br><br>
	<p>Password : </p>
	<input type="text" name="password" required placeholder="Enter Password"/>
	
	<br><br><br><br><br>
	<input type="submit" value="Login" />
	</fieldset>
		
	</form>
</center>

</body>
</html>