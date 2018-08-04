package com.nucleus.day2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass2 {

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Vendor v=(Vendor)session.get(com.nucleus.day2.Vendor.class,5);
		v.setvName("K");
		session.update(v);
		t.commit();
		session.close();
		
	}

}
