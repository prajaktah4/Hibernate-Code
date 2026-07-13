package com.MainApp;

import java.util.List;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import com.Entity.Answer;
import com.Entity.Question;

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
    	cfg.addAnnotatedClass(Question.class);
    	cfg.addAnnotatedClass(Answer.class);
    	
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	
    	Transaction t = s.beginTransaction();
    	/*
    	Question q = new Question();
    	q.setId(101);
    	q.setQuuestion("What is java?");
    	
    	
    	Answer a1 = new Answer();
    	a1.setId(1);
    	a1.setAnswer("Java is programming language.");
    	a1.setQues(q);
    	
    	Answer a2 = new Answer();
    	a2.setId(1);
    	a2.setAnswer("Java is OOP.");
    	a2.setQues(q);
    	
    	Answer a3 = new Answer();
    	a3.setId(1);
    	a3.setAnswer("Java connectivity.");
    	a3.setQues(q);
    	
    	List<Answer> l= List.of(a1, a2, a3);
    	q.setAns(l);
    	
    	s.save(q);
    	t.commit();
    	*/
    	
    	Question q = s.get(Question.class, 101);
    	System.out.println(q.getId());
    	System.out.println(q.getQuuestion());
    	System.out.println(q.getAns());
    	List<Answer> l = q.getAns();
    	for(Answer a:l)
    	{
    		System.out.println(l);
    	}

    	

    	} 
} 
