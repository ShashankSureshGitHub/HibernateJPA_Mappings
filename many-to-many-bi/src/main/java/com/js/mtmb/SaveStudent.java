package com.js.mtmb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Course c1=em.find(Course.class, 1);
		Course c2=em.find(Course.class, 2);
		Course c3=em.find(Course.class, 3);
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		Student s=new Student();
		s.setStudentName("ajay");
		s.setAge(21);
		s.setPhoneNumber(6786756456l);
		s.setCourses(courses);
		
		et.begin();
		em.persist(s);
		et.commit();
		
	}

}
