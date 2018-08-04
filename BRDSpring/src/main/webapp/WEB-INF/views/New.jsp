<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
color:red;
}
</style>
</head>
<body><center>
<form:form name="myForm" action="/BRDSpring/new" method="post" commandName="customer">
Customer code:<br>
<form:input type="text" name="Code" path="Code"/><br>
<form:errors path="Code" Class="error"/><br>
Customer name:<br>
<form:input type="text" name="Name" path="Name"/><br>
<form:errors path="Name" Class="error"/><br>
Customer Primary Address:<br>
<form:input type="text" name="Ad1" path="Ad1"/><br>
<form:errors path="Ad1" Class="error"/><br>
Customer secondary Address:<br>
<form:input type="text" name="custAd2" path="custAd2"/><br>
<form:errors path="custAd2" Class="error"/><br>
Customer Pin Code:<br>
<form:input type="text" name="custPinCode" path="custPinCode"/><br>
<form:errors path="custPinCode" Class="error"/><br>
Customer Email-Id:<br>
<form:input type="text" name="custEmail" path="custEmail"/><br>
<form:errors path="custEmail" Class="error"/><br>
Customer Contact Number:<br>
<form:input type="text" name="Contact" path="Contact"/><br>
<form:errors path="Contact" Class="error"/><br>
Customer Primary Contact Person:<br>
<form:input type="text" name="custPrimaryContactPerson" path="custPrimaryContactPerson"/><br>
<form:errors path="custPrimaryContactPerson" Class="error"/><br>
Customer Record Status:<br>
<form:input name="custRecordStatus" path="custRecordStatus" value="N"/>New<br>
<form:errors path="custRecordStatus" Class="error"/><br>
 Customer Flag Value:<br>
 <form:input name="custFlag" path="custFlag" value="A" />Active<br>
 <form:errors path="custFlag" Class="error"/><br>
Created by:<br>
<form:input type="text" name="custCreatedBy" path="custCreatedBy"/><br>
<form:errors path="custCreatedBy" Class="error"/><br>
<input type="submit" name="Create" value="Create"/><br>
</form:form>
</center>
</body>
</html>