<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validateNew()
{ 
	var code=document.forms["myForm"]["code"].value;
	var name=document.forms["myForm"]["name"].value;
	var AD1=document.forms["myForm"]["AD1"].value;
	var pincode=document.forms["myForm"]["pincode"].value;
	var email=document.forms["myForm"]["email"].value;
	var contact=document.forms["myForm"]["contact"].value;
	var cperson=document.forms["myForm"]["cperson"].value;
	var record=document.forms["myForm"]["record"].value;
	var flag=document.forms["myForm"]["flag"].value;
	var createby=document.forms["myForm"]["createby"].value;
	var createdate=document.forms["myForm"]["createdate"].value;
	var reg=/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
	var date_regex =/^([0-9]{2}-[A-Za-z]{3}-[0-9]{4})$/;
	if(code =="")
		{
		alert("Code must be filled out");
		return false;
		}
	else if(name =="")
	{
	alert("Name must be filled out");
	return false;
	}
	else if( /[^a-zA-Z0-9]/.test(name))
	{
	alert("Name should only contain alphabets or number");
	return false;
	}
	else if(AD1 =="")
	{
	alert("Primary Address must be filled out");
	return false;
	}
	else if(pincode =="")
	{
	alert("Pin-Code must be filled out");
	return false;
	}
	else if(pincode.length!=6)
		{
		alert("Pin code length must be 6");
		return false;
		}
	else if( /[^0-9]/.test(pincode))
	{
	alert("Pin code must be number");
	return false;
	}
	else if(email =="")
	{
	alert("Email-Id must be filled out");
	return false;
	}
	else if(reg.test(email) == false)
	{
	alert("Email-Id Format is wrong");
	return false;
	}
	else if(contact =="")
	{
	alert("Contact Number must be filled out");
	return false;
	}
	else if( /[^0-9]/.test(contact))
	{
	alert("Contact must be number");
	return false;
	}
	else if(contact.length!=10)
	{
	alert("Contact should be 10 digit number");
	return false;
	}
	else if(cperson =="")
	{
	alert("Primary Contact Person must be filled out");
	return false;
	}
	else if(record =="")
	{
	alert("Record Status must be filled out");
	return false;
	}
	else if(flag =="")
	{
	alert("Flag Status must be filled out");
	return false;
	}
	else if(createby =="")
	{
	alert("Created by field must be filled out");
	return false;
	}
	else if(createdate =="")
	{
	alert("Crete Date must be filled out");
	return false;
	}
	else if(date_regex.test(createdate) == false)
	{
	alert("Create Date must be in valid format");
	return false;
	}
}
</script>
</head>
<body>
<form name="myForm" action="CustomerServlet?action=new" method="post" onsubmit="return validateNew()">
Customer code:<br>
<input type="text" name="code"><br>
Customer name:<br>
<input type="text" name="name"><br>
Customer Primary Address:<br>
<input type="text" name="AD1"><br>
Customer secondary Address:<br>
<input type="text" name="AD2"><br>
Customer Pin Code:<br>
<input type="text" name="pincode"><br>
Customer Email-Id:<br>
<input type="text" name="email"><br> 
Customer Contact Number:<br>
<input type="text" name="contact"><br>
Customer Primary Contact Person:<br>
<input type="text" name="cperson"><br>
Customer Record Status:<br>
<input type="radio" name="record" value="N" checked>New<br>
<input type="radio" name="record" value="A">Authorized<br>
<input type="radio" name="record" value="D" >Delete<br>
<input type="radio" name="record" value="M" >Modified<br>
<input type="radio" name="record" value="R" >Rejected<br>
 Customer Flag Value:<br>
 <input type="radio" name="flag" value="A" checked>Active<br>
 <input type="radio" name="flag" value="I">InActive<br>
Created by:<br>
<input type="text" name="createby"><br>
Create date:(dd-mon-yyyy)<br>
<input type="text" name="createdate" id="date"><br><br>
<input type="submit" name="Create" value="Create"><br>
</form>
</body>
</html>