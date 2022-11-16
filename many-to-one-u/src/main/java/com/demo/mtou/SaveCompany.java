package com.demo.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCompany {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Company c=new Company();
		c.setName("Jspisders");
		c.setGst("JSP123");
		
		et.begin();
		em.persist(c);
		et.commit();
	}

}
