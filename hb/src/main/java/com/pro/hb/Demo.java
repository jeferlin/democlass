package com.pro.hb;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

import javax.persistence.Entity;

import org.hibernate.*;
@Entity
public class Demo 
{
	public static void main(String arg[])
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		com.pro.hb.Product product=new com.pro.hb.Product();
		product.setProdId("P1002");
		product.setProdName("Samsung Galaxy");
		product.setPrice(11000);
		
		session.save(product);
		
		transaction.commit();
		
		session.close();
		
		System.out.println("Object Saved");
		
	}
}