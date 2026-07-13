package com.MainApp;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.Entity.Developer;
import com.Entity.Employee;
import com.Entity.SalesPerson;

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
    	cfg.addAnnotatedClass(Developer.class);
    	cfg.addAnnotatedClass(SalesPerson.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	
    	Transaction t = s.beginTransaction();

    		
    	Developer d = new Developer();
    	d.setId(101);
    	d.setName("Raju");
    	d.setSalary(10000);
    	d.setSkill("Java");
    	d.setProject("API");
    	
    	
    	SalesPerson sp = new SalesPerson();
    	sp.setId(201);
    	sp.setName("Kaju");
    	sp.setSalary(5000);
    	sp.setClient("XYZ");
    	sp.setTarget("1cr");
    	
    	s.save(d);
    	s.save(sp);
    	
    	t.commit();
    
    	
    	
    //	Developer dp = s.get(Developer.class, 101);
    //	System.out.println(dp);
    	
    	} 
} 
