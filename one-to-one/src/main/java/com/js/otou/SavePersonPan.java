package com.js.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {

	public static void main(String[] args) {
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
		
		et.begin();
		em.persist(p);
		em.persist(pan);
		et.commit();

	}

}
