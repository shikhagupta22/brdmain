package com.nucleus.service;

import com.nucleus.database.UserDao;
import com.nucleus.database.UserDaoI;

public class Service 
{
	public int login(String name, String pass)
	{
		UserDaoI u=new UserDao();
		int x=u.login(name,pass);
		return x;
	}
}
