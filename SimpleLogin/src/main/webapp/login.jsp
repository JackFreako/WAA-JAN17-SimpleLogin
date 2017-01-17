<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="edu.mum.login.controller.LoginServlet"%>
    


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Please Login </title>
</head>

<body>


<form action="LoginServlet" method="post">
	UserName : <input type="text" name="username" placeholder="UserName" > <br>
	Password : <input type="password" name="password" placeholder="Password" ><br>
<input type="submit" value="Login">

<div>${errorMessage}</div>

</form>

</body>
</html>