package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class LoadObjectTestingByGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Configuration Object
		
		Configuration cfg=new Configuration();
		cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		

		//begin the Tx
		Transaction tx=null;
		
		// Biuld Session Factory with try with resource
		
		try (SessionFactory factory=cfg.buildSessionFactory();
				
				Session ses=factory.openSession();){//try with resource
			
			//Load Object using get() method..
			
			Product prod=ses.get(Product.class, 1002);
			
			if(prod==null)
				System.out.println("Oppss...!!  Product Not Found...");
			else
				System.out.println(prod);
			
		}
		
		catch(HibernateException he)
		{
			he.printStackTrace();
		}

	}

}
