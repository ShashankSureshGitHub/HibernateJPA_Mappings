package com.js.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteByPanId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Pan pan=em.find(Pan.class, 4);
		if(pan!=null)
		{
			Person p=pan.getPerson();
			if(p!=null)
			{
				et.begin();
				em.remove(p);
				em.remove(pan);
				et.commit();
				System.out.println("Successfully deleted pan and person");
			}
		}
		else
		{
			System.out.println("No pan for the given Id");
		}
	}

}
