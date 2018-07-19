package com.nucleus.service;

import java.util.ArrayList;

import com.nucleus.database.CustomerDaoI;
import com.nucleus.database.CustomerFactory;
import com.nucleus.pojo.Customer;

public class ServiceCustomer 
{
	CustomerDaoI cd=CustomerFactory.getDao("customer");
	public int validId(String id)
	{
		
		boolean b=cd.validId(id);
		System.out.println(b);
		if(b==false)
		{
			System.out.println("Customer code should be unique");
			return 0;
		}
		return 1;
		
	}
	public int insert(Customer customer) 
	{
		//CustomerDaoI cd=CustomerFactory.getDao("customer");
		int insert=cd.insert(customer);
		return insert;
	}
	public ArrayList<Customer> viewAll() 
	{
		//CustomerDaoI cd=CustomerFactory.getDao("customer");
		ArrayList<Customer> cust=cd.viewAll();
		return cust;
		
	}
	public Customer view(String code)
	{
		Customer customer=cd.view(code);
		return customer;
		
	}
	public int delete(String code) 
	{
		int isDeleted=cd.delete(code);
		return isDeleted;
	}
	public Customer update(String code) 
	{
		Customer customer=cd.update(code);
		return customer;
		
		
	}
	public int updateDo(Customer customer) 
	{
		int update=cd.updateDo(customer);
		return update;
	}
	

}
