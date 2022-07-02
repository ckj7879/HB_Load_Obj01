package com.nt.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import org.hibernate.HibernateException;

import com.nt.entity.Product;

public class SaveObjectTest 
{
    public static void main( String[] args ) 
    {
    	
    	
    	//System.out.print("Hi..Ckj...");
    	
    	
    	Configuration cfg=new Configuration();

    	System.out.println(cfg.getProperties());
    	cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
    	

    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session ses=factory.openSession();
    	
    	Transaction tx=null;
    	
    	try(factory;ses) // try with resource (TWR)
    	{
    		tx=ses.beginTransaction();
    		
    		Product prod=new Product();
    		//prod.setPid(1010);
    		prod.setPname("Net");
    		prod.setPrice(35f);
    		prod.setQty(1f);
    		
    		Integer idval=(Integer) ses.save(prod);
    		
    		
    		System.out.println("The Generated ID Value is  = "+idval);
    		
    		//ses.persist(prod);
    		
    		tx.commit();
    		
    		System.out.println("Object Saved...and Record Inserted...");
    		
    		
    	}
    	catch(HibernateException e)
    	{
    		System.out.println(e);
    		e.printStackTrace();
    		
    		if(tx!=null && tx.getRollbackOnly() && tx.getStatus()!=null)
    			tx.rollback();
    		
    		System.out.println("Opps..Object is not saved..and Record not Inserted..");
    	}
    	
    	ses.close();
    	factory.close();   
    }
}
