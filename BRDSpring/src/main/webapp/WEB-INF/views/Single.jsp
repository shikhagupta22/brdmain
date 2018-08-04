<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="Menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table id="example" cellspacing="0"  class="display" width="60%">
        <thead>
            <tr>
                <tr>
                <th>Customer Code</th>
                <th>Customer Name</th>
                 <th>Customer Address1</th>
                  <th>Customer Address2</th>
                   <th>Customer Pin Code</th>
                    <th>Customer Email</th>
                     <th>Customer Contact Number</th>
                      <th>Customer Primary Contact Person</th>
                       <th>Customer Record Status</th>
                        <th>Customer Flag Status</th>
                         <th>Customer Create Date</th>
                          <th>Customer Created by </th>
                           <th>Customer Modify date</th>
                            <th>Customer Modified by</th>
                             <th>Customer Authorized date</th> 
                             <th>Customer Authorized by</th>
                             
            </tr>
            
        </thead>
        <tfoot>
            <tr>
                <th>Customer Code</th>
                <th>Customer Name</th>
                 <th>Customer Address1</th>
                  <th>Customer Address2</th>
                   <th>Customer Pin Code</th>
                    <th>Customer Email</th>
                     <th>Customer Contact Number</th>
                      <th>Customer Primary Contact Person</th>
                       <th>Customer Record Status</th>
                        <th>Customer Flag Status</th>
                         <th>Customer Create Date</th>
                          <th>Customer Created by </th>
                           <th>Customer Modify date</th>
                            <th>Customer Modified by</th>
                             <th>Customer Authorized date</th> 
                             <th>Customer Authorized by</th>
            </tr>
        </tfoot>
        <tbody>
       
			   <tr>
                       
                           <td>${customers.getCode()}</td>
                            <td>${customers.getName()}</td>
                             <td>${customers.getAd1()}</td>
                              <td>${customers.getCustAd2()}</td>
                               <td>${customers.getCustPinCode()}</td>
                                <td>${customers.getCustEmail()}</td>
                                 <td>${customers.getContact()}</td>
                                  <td>${customers.getCustPrimaryContactPerson()}</td>
                                   <td>${customers.getCustRecordStatus()}</td>
                                    <td>${customers.getCustFlag()}</td>
                                     <td>${customers.getCustCreateDate()}</td>
                                      <td>${customers.getCustCreatedBy()}</td>
                                       <td>${customers.getCustModifiedDate()}</td>
                                        <td>${customers.getCustModifiedBy()}</td>
                                         <td>${customers.getCustAuthorizedDate()}</td>
                                          <td>${customers.getCustAuthorizedBy()}</td>
                    </tr>
        </tbody>
        </table>
<script src="https://code.jquery.com/jquery-1.12.4.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script>
$(document).ready(function()
{
    $('#example').DataTable();
} );
</script>
</body>
</html>