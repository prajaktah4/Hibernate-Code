package com.MainApp;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.Entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//hibernate configuration
    	
    	Properties p = new Properties();
    	
    	p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    	p.put(Environment.URL, "jdbc:mysql://localhost:3306/mydatabase");
    	p.put(Environment.PASS, "");
    	p.put(Environment.USER, "root");
    	
    	
    	p.put(Environment.HBM2DDL_AUTO, "update");
    	p.put(Environment.SHOW_SQL, true);
    	
    	Configuration cfg = new Configuration();
    	cfg.setProperties(p);
    	cfg.addAnnotatedClass(Student.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	
    	Transaction t = s.beginTransaction();
 //insert
    	
    	
//    	Student st = new Student();
//    	st.setRoll(1);
//    	st.setName("prajakta");
//    	st.setMarks(89.0);
//    	
//    	s.save(st);
//    	t.commit();
    	    	
    	
   //update 	
    	
    	/*
    	 * Student st = s.get(Student.class, 1);
    	
         if(st != null)
      	   {
      	   st.setName("xyz");
      	   st.setMarks(1000.0);
      	   s.update(st);
     	   t.commit();
      	   System.out.println("Updated successfully");
      	   }
         else
         {
      	   System.out.println(" does not exist");
         }
        */ 
    	
    	
    	//read
         Student st = s.get(Student.class, 1);
         System.out.println(st);
    }   
}
