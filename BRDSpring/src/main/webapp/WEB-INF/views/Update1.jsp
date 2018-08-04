<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Customer Details:</title>
<script type="text/javascript">
function validateForm1()
{ 
	var x=document.MyForm1.code.value;
	if(x ==""||x==null)
		{
		alert("Code must be filled out");
		return false;
		}
}
</script>
</head>
<body>
<form name="MyForm1" action="/BRDSpring/update" method="post" onsubmit="return validateForm1()">
Enter customer code:
<input type="text" name="code" id="code"><br>
<button type="submit" name="submit" >Submit</button>
</form>
</body>
</html>