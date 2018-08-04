package com.nucleus.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nucleus.entity.Customer;
import com.nucleus.mapper.CustomerMapper;
@Repository
public class CustomerDao implements CustomerDaoI 
{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public int insert(Customer customer)
	{
		int insert=0;
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String sql="insert into customer_shikha values(seq_id1.nextval,'"+customer.getCode()+"','"+customer.getName()+"','"+customer.getAd1()+"','"+customer.getCustAd2()+"',"+customer.getCustPinCode()+",'"+customer.getCustEmail()+"',"+customer.getContact()+",'"+customer.getCustPrimaryContactPerson()+"','"+customer.getCustRecordStatus()+"','"+customer.getCustFlag()+"','"+formatter.format(date)+"','"+customer.getCustCreatedBy()+"',"+customer.getCustModifiedDate()+","+customer.getCustModifiedBy()+","+customer.getCustAuthorizedDate()+","+customer.getCustAuthorizedBy()+")";
		insert = this.jdbcTemplate.update(sql);
		return insert;
		
	}
	@Override
	public Customer selectToUpdate(String code) 
	{
		String sql="select * from customer_shikha where customer_code=?";
		@SuppressWarnings("unchecked")
		Customer customer=(Customer) this.jdbcTemplate.queryForObject(sql, new Object[]{code}, new CustomerMapper());
		return customer;
		
	}
	@Override
	public int updateCustomer(Customer customer,String code) 
	{
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String sql="update customer_shikha SET customer_id=seq_id1.nextval,customer_name=?,customer_ad1=?,customer_ad2=?,customer_pincode=?,email_id=?,contact_number=?,primary_contact_person=?,record_status=?,flag=?,modified_date=?,modified_by=? where customer_code=?";
		int isUpdated=this.jdbcTemplate.update(sql, new Object[]{customer.getName(),customer.getAd1(),customer.getCustAd2(),customer.getCustPinCode(),customer.getCustEmail(),customer.getContact(),customer.getCustPrimaryContactPerson(),customer.getCustRecordStatus(),customer.getCustFlag(),formatter.format(date),customer.getCustModifiedBy(),code});
		return isUpdated;
	}
	@Override
	public Customer viewById(String code) 
	{
		String sql="select * from customer_shikha where customer_code=?";
		@SuppressWarnings("unchecked")
		Customer customer=(Customer) this.jdbcTemplate.queryForObject(sql, new Object[]{code}, new CustomerMapper());
		return customer;
		
	}
	@Override
	public List<Customer> viewAll() 
	{
		String sql="select * from customer_shikha";
		@SuppressWarnings("unchecked")
		List<Customer> customer=this.jdbcTemplate.query(sql, new CustomerMapper());
		return customer;
		
	}
	@Override
	public int delete(String code) 
	{
		String sql="delete from customer_shikha where customer_code=?";
		int isDeleted=this.jdbcTemplate.update(sql, new Object[]{code});
		return isDeleted;
		
	}

}
