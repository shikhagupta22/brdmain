package com.nucleus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleus.dao.CustomerDaoI;
import com.nucleus.entity.Customer;

@Service
public class CustomerService implements CustomerServiceI
{
	@Autowired
    CustomerDaoI customerDaoI;
	@Override
	public int insert(Customer customer) 
	{
		int insert=customerDaoI.insert(customer);
		return insert;
	}
	@Override
	public Customer selectToUpdate(String code) 
	{
		Customer customer=(Customer)customerDaoI.selectToUpdate(code);
		return customer;
		
	}
	@Override
	public int updateCustomer(Customer customer,String code) 
	{
		int isUpdated=customerDaoI.updateCustomer(customer,code);
		return isUpdated;
	
		
	}
	@Override
	public Customer viewbyId(String code) 
	{
		Customer customer=(Customer)customerDaoI.viewById(code);
		return customer;
		
	}
	@Override
	public List<Customer> viewAll() 
	{
		List<Customer> customer=customerDaoI.viewAll();;
		return customer;
	}
	@Override
	public int delete(String code) 
	{
		int isDeleted=customerDaoI.delete(code);
	return isDeleted;
	
	}

}
