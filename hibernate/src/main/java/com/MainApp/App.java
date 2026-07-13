package com.MainApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Employee;

public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		// System.out.println(s);

		// insert

		/*
		 * Employee e = new Employee();
		 *  e.setId(101);
		 *   e.setName("raju");
		 * e.setSalary(5000.0);
		 *  s.save(e);
		 */
		/*
		 * Employee e = new Employee();
		 *  e.setId(104);
		 *   e.setName("sam");
		 * e.setSalary(2500.0);
		 *  s.save(e);
		 * 
		 * t.commit();
		 */

		// read

//       Employee e = s.get(Employee.class, 101);
//    		   System.out.println(e);

		/*
		 * delete
		 * 
		 * Employee e = s.get(Employee.class, 101);
		 *  if(e != null) 
		 *  {
		 *   s.delete(e);
		 *   t.commit();
		 *  System.out.println("Deleted successfully"); 
		 *  }
		 *   else
		 *    {
		 * System.out.println("Employee does not exist");
		 *  }
		 * 
		 */

		// update
		Employee e = s.get(Employee.class, 102);
		if (e != null) {
			e.setName("xyz");
			e.setSalary(1000.0);

			s.update(e);
			t.commit();

			System.out.println("Updated successfully");
		} else {
			System.out.println("Employee does not exist");
		}

	}
}
