package com.revature.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.hibernate.entity.Users;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                .configure("hibernate.cfg.xml")
				                .addAnnotatedClass(Users.class)
				                .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			//create object of entity class type	
			//start transaction
			//perform operation;			
			//commit transaction

			//insert a row
			/*
			Users user = new Users("username", "password", "firstName", "lastName");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("row added");
			//*/
			
			//return row
			/*
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 0);
			session.getTransaction().commit();
			System.out.println(user);
			//*/
			//update a row
			/*
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 0);
			user.setUsername("Jeffafa");
			session.getTransaction().commit();
			System.out.println(user);
			//*/
			//delete a row
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 0);
			session.delete(user);
			session.getTransaction().commit();
			System.out.println(user);
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
