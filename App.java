package com.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
  	
    //SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  	Session session = factory.openSession();
  	
    Transaction tx = session.beginTransaction();  	
 /* 	Book book1 = new Book();
  	book1.setBookname("JAVA");
  	book1.setBookPrice(999.99);
  	book1.setBookPages(600);
    Book book2 = new Book();
    book2.setBookname("Let Us C");
  	book2.setBookPrice(300);
  	book2.setBookPages(250);
	
    session.save(book1);
   	session.save(book2);*/
  	
    	tx.commit(); 
  	
  //retrieve data from database
	//using get method
	Book book = session.get(Book.class, 2);
	System.out.println(book);
	
	//using load method
	Book book3 =session.load(Book.class, 1);
	System.out.println(book3);
  	
	Session session2 = factory.openSession();
	Book book5 =session2.get(Book.class, 1);
	System.out.println(book5);
	
	session2.close();
  	factory.close();
    }
}
