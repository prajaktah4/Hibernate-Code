package com.MainApp;

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
    	
    	Question q = new Question();
    	q.setId(101);
    	q.setQuuestion("What is java?");
    	
    	
    	Answer ans = new Answer();
    	ans.setId(1);
    	ans.setAnswer("Java is programming language.");
    	ans.setQues(q);
    	
    	q.setAns(ans);
    	
    	s.save(q);
    	s.save(ans);
    	t.commit();
    	
//    	
//    	Question q = s.get(Question.class, 101);
//    	System.out.println(q.getId());
//    	System.out.println(q.getQuuestion());
//    	System.out.println(q.getAns().getId());
//    	System.out.println(q.getAns().getAnswer());

    	} 
} 
