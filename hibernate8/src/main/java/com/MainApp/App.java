package com.MainApp;



import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.Entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Properties p = new Properties();
    	
    	p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    	p.put(Environment.URL, "jdbc:mysql://localhost:3306/mydb");
    	p.put(Environment.PASS, "");
    	p.put(Environment.USER, "root");
    	
    	
    	p.put(Environment.HBM2DDL_AUTO, "update");
    	p.put(Environment.SHOW_SQL, true);
    	
    	Configuration cfg = new Configuration();
    	cfg.setProperties(p);
    	cfg.addAnnotatedClass(Employee.class);
    	
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	
    	Transaction t = s.beginTransaction();
//
//    		String hql = "from Employee";
////    		Query q = s.createQuery(hql);
//    		List l = q.list();
//    		System.out.println(l);
    	
    	/*
    	String hql = "select e.id, e.name from Employee";
    	Query q =s.createQuery(hql);
    	List list = q.list();
    	Iterator itr = list.iterator();
    	
    	while(itr.hasNext())
    	{
    		Object arr[] = (Object[]) itr.next();
    		for(Object o:arr)
    		{
    			System.out.println(o);
    		}
    	}
    	*/
    	
    	
    	Criteria cr = s.createCriteria(Employee.class);
    	
//    	cr.setFirstResult(1);
//    	cr.setMaxResults(2);
    	
//    	cr.addOrder(Order.asc("salary"));
//    	cr.addOrder(Order.desc("salary"));
//    	cr.add(Restrictions.gt("salary", 500.0));
//    	cr.add(Restrictions.lt("salary", 500.0));
//    	cr.add(Restrictions.between("salary", 500.0, 1000.0));
    	
    	
    	
//    	cr.setProjection(Projections.rowCount());
//    	cr.setProjection(Projections.sum("salary"));
//    	cr.setProjection(Projections.avg("salary"));
//    	cr.setProjection(Projections.min("salary"));
    	cr.setProjection(Projections.max("salary"));
    	
   	
    	List l = cr.list();
    	System.out.println(l);
    	} 
} 
