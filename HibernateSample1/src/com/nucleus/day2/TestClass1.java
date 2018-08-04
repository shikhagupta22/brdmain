package com.nucleus.day2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass1 {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Address adrs=new Address();
		adrs.setCity("Agra");
		adrs.setState("UP");
		Address adrs1=new Address();
		adrs1.setCity("Kanpur");
		adrs1.setState("UP");
		Vendor v=new Vendor();
		v.setvName("Akash");
	   v.getAdrs().add(adrs1);
	   v.getAdrs().add(adrs);
		session.save(v);
		t.commit();
		session.close();
	}

}
