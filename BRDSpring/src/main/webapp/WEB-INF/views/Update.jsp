<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file="Menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="Form" action="/BRDSpring/updatedo" method="post" onsubmit="return validateNew()">
Customer code:<br>
<input type="text" name="Code" value="${customer.getCode()}" readonly><br>
Customer name:<br>
<input type="text" name="Name"  value="${customer.getName()}"><br>
Customer Primary Address:<br>
<input type="text" name="Ad1"  value="${customer.getAd1()}"><br>
Customer secondary Address:<br>
<input type="text" name="custAd2"  value="${customer.getCustAd2()}"><br>
Customer Pin Code:<br>
<input type="text" name="custPinCode"  value="${customer.getCustPinCode()}"><br>
Customer Email-Id:<br>
<input type="text" name="custEmail"  value="${customer.getCustEmail()}"><br> 
Customer Contact Number:<br>
<input type="text" name="Contact"  value="${customer.getContact()}"><br>
Customer Primary Contact Person:<br>
<input type="text" name="custPrimaryContactPerson"  value="${customer.getCustPrimaryContactPerson()}"><br>
Customer Record Status:<br>
<input type="radio" name="custRecordStatus" value="N">New<br>
<input type="radio" name="custRecordStatus" value="A">Authorized<br>
<input type="radio" name="custRecordStatus" value="D" >Delete<br>
<input type="radio" name="custRecordStatus" value="M" checked>Modified<br>
<input type="radio" name="custRecordStatus" value="R" >Rejected<br>
 Customer Flag Value:<br>
 <input type="radio" name="custFlag" value="A" checked>Active<br>
 <input type="radio" name="custFlag" value="I">InActive<br>
Modified by:<br>
<input type="text" name="custModifiedBy"  value="${customer.getCustModifiedBy()}"><br>
<input type="submit" name="Update" value="Update"><br>
</form>
</body>
</html>