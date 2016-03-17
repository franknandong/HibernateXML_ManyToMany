package com.fndong.role;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        // Set the value for ROle 1 and Role 2 , its name / description
        // set the transaction for its name /description
        
        Transactions trans1 = new Transactions("Approver ID");
        Transactions trans2 = new Transactions("Submission ID");
        
        
        Role role1 = new Role("Approver Role");
        Role role2 = new Role("Submission Role");
 
        // Set the trans 1 to role 1 
        // Set the trans 2 to role 1 , Why?
        // Set the trans 2 to role 2 , Why?
        role1.getTransactionses().add(trans1);
        role1.getTransactionses().add(trans2);
        role2.getTransactionses().add(trans2);
        
         
        session.save(role1);
        session.save(role2);
         
        session.getTransaction().commit();
        session.close();
    }
}
