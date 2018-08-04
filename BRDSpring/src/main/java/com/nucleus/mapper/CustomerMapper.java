package com.nucleus.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nucleus.entity.Customer;

public class CustomerMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Customer customer=new Customer();
		customer.setCode(rs.getString("customer_code"));
		customer.setName(rs.getString("customer_name"));
		customer.setAd1(rs.getString("customer_ad1"));
		customer.setCustAd2(rs.getString("customer_ad2"));
		customer.setCustPinCode(rs.getString("customer_pincode"));
		customer.setCustEmail(rs.getString("email_id"));
		customer.setContact(rs.getString("contact_number"));
		customer.setCustPrimaryContactPerson(rs.getString("primary_contact_person"));
		customer.setCustRecordStatus(rs.getString("record_status"));
		customer.setCustFlag(rs.getString("flag"));
		customer.setCustCreateDate(rs.getString("create_date"));
		customer.setCustCreatedBy(rs.getString("created_by"));
		customer.setCustModifiedDate(rs.getString("modified_date"));
		customer.setCustModifiedBy(rs.getString("modified_by"));
	    customer.setCustAuthorizedDate(rs.getString("authorized_date"));
		customer.setCustAuthorizedBy(rs.getString("authorized_by"));
		return customer;
	}

}
