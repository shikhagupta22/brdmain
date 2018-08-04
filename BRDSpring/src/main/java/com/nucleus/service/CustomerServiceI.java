package com.nucleus.service;

import java.util.List;

import com.nucleus.entity.Customer;

public interface CustomerServiceI {

	int insert(Customer customer);

	Customer selectToUpdate(String code);

	int updateCustomer(Customer customer,String code);

	Customer viewbyId(String code);

	List<Customer> viewAll();

	int delete(String code);

}
