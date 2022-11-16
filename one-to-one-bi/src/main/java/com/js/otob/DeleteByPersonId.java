package com.js.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DeleteByPersonId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=em.find(Person.class,1);
		if(p!=null)
		{
			Pan pan=p.getPan();
			if(pan!=null)
			{
				et.begin();
				em.remove(pan);
				em.remove(p);
				et.commit();
				System.out.println("Successfully deleted Pan and Person");
			}
		else
		{
			System.out.println("No Person in the given id");
		}
		}

	}

}
