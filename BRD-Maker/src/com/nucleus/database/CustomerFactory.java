package com.nucleus.database;

public class CustomerFactory 
{
	public static CustomerDaoI getDao(String dao)
	{
		if(dao.equalsIgnoreCase("customer"))
		{
			return new CustomerDao();
		}
		return null;
		
	}

}
