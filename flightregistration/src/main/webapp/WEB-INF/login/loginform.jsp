<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Login Form</title>
</head>
<body>
<form action="login" method="post">
 <pre>
    <label for="uname"><b>Email</b></label>
    <input type="text" placeholder="Enter Username" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passWord" required>

    <button type="submit" class="btn btn-primary" value ="sumbit">Login</button>
    </pre>
    </form>
</body>
</html>