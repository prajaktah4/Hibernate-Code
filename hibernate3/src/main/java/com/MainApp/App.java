package com.MainApp;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.Entity.Address;
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
    	
    /*
    	Address add = new Address();
    	add.setPin(413102);
    	add.setCity("Baramati");
    	
    	Employee e = new Employee();
    	e.setName("Shrushti");
    	e.setSalary(5000);
    	e.setAdd(add);
    	
    	s.save(e);
    	t.commit();
    */
    	
    	Employee employee = s.get(Employee.class, 1);
    	System.out.println(employee);
    	} 
} 
