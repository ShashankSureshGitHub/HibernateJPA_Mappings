package com.js.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DeleteById {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=em.find(Person.class,1);
		Pan pan=p.getPan();
		if(p!=null)
		{
			if(pan!=null)
			{
				et.begin();
				em.remove(pan);
				em.remove(p);
				System.out.println("Successfully deleted Pan and Person");
			}
		else
		{
			System.out.println("No Person in the given id");
		}
		}
	}
}
