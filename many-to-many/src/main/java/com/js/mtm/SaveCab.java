package com.js.mtm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCab {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Cab c = new Cab();
		c.setDriverName("Balu");
		c.setPrice(132);

		et.begin();
		em.persist(c);
		et.commit();

	}

}
