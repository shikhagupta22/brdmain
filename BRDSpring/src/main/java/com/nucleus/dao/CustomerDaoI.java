package com.nucleus.dao;

import java.util.List;

import com.nucleus.entity.Customer;

public interface CustomerDaoI 
{

	public int insert(Customer customer);

	public Customer selectToUpdate(String code);

	public int updateCustomer(Customer customer, String code);

	public Customer viewById(String code);

	public List<Customer> viewAll();

	public int delete(String code);

}
