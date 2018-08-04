<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
       
                <c:forEach items="${customers}" var="customer">
			   <tr>
                           <td>${customer.getCode()}</td>
                            <td>${customer.getName()}</td>
                             <td>${customer.getAd1()}</td>
                              <td>${customer.getCustAd2()}</td>
                               <td>${customer.getCustPinCode()}</td>
                                <td>${customer.getCustEmail()}</td>
                                 <td>${customer.getContact()}</td>
                                  <td>${customer.getCustPrimaryContactPerson()}</td>
                                   <td>${customer.getCustRecordStatus()}</td>
                                    <td>${customer.getCustFlag()}</td>
                                     <td>${customer.getCustCreateDate()}</td>
                                      <td>${customer.getCustCreatedBy()}</td>
                                       <td>${customer.getCustModifiedDate()}</td>
                                        <td>${customer.getCustModifiedBy()}</td>
                                         <td>${customer.getCustAuthorizedDate()}</td>
                                          <td>${customer.getCustAuthorizedBy()}</td>
                    </tr>
			</c:forEach>
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