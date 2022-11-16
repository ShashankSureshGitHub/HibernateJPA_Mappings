package com.demo.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Branch b=em.find(Branch.class, 5);
		{
			if(b!=null)
			{
				et.begin();
				em.remove(b);
				et.commit();
				System.out.println("Successful");
			}
			else
			{
				System.out.println("No Branch by the given Id");
			}
		}

	}

}
