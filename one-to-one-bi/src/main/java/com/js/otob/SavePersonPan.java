package com.js.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Pan pan=new Pan();
		pan.setDob("22-jan-1982");
		pan.setPanNumber("TCA563455D");
		
		Person p=new Person();
		p.setName("Karan");
		p.setEmail("Karaneshh@gmail.com");
		p.setPhone(9867367363l);
		p.setPan(pan);
		pan.setPerson(p);
		et.begin();
		em.persist(pan);
		em.persist(p);
		et.commit();

	}

}
