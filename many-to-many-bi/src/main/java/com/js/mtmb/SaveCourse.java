package com.js.mtmb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCourse {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Course c1=new Course();
		Course c2=new Course();
		Course c3=new Course();
		
		c1.setCourseName("Java");
		c1.setFee(23000);
		
		c2.setCourseName("Python");
		c2.setFee(19000);
		
		c3.setCourseName("Web Development");
		c3.setFee(21000);
		
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();

	}

}
