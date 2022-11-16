package com.js.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateById {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=em.find(Person.class,2);
		if(p!=null)
		{
			p.setEmail("kanak@gmail.com");
			p.setPhone(987654321l);
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("Updated Successfully");
		}
		else
		{
			System.out.println("Person not present");
		}
	}

}
