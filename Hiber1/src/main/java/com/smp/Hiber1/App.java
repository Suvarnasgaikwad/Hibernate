package com.smp.Hiber1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Student stud=new Student();
		stud.setId(2);
		stud.setName("Smp");
		stud.setAddress("Ankoli");
		Transaction tx=s.beginTransaction();
		s.save(stud);
		tx.commit();
		s.close();
		factory.close();
        }
        catch(HibernateException e)
        {
        	e.printStackTrace();
        }
    }
}
