package com.js.mtm;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateById {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=em.find(Person.class,1);
		if(p!=null)
		{
			p.setEmail("rajuraju@gmail.com");
			p.setPersonName("Raju");
			
			et.begin();
			em.merge(p);
			et.commit();
		}
		else
		{
			System.out.println("Person not present for the given Id");
		}
	}
}
