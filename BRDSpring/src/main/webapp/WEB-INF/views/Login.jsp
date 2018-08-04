<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>
<form name="myForm" action="j_spring_security_check" method="post" onsubmit="return validateForm()">
Username:<br>
<input type="text" name="j_username"/><br>
Password:<br>
<input type="password" name="j_password"/><br>
<input type="submit" value="login"><br>
</form>
</body>
</html>