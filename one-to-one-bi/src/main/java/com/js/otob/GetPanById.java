package com.js.otob;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPanById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Pan pan=em.find(Pan.class, 2);
		if(pan!=null)
		{
			System.out.println("Pan number of person "+pan.getPanNumber());
			System.out.println("DOB of person "+pan.getDob());
			
			Person p=pan.getPerson();
			if(p!=null)
			{
				System.out.println("Person name "+p.getName());
				System.out.println("Person Email "+p.getEmail());
				System.out.println("Person phone number "+p.getPhone());
			}
			else
			{
				System.out.println("Pan has no person associated with it");
			}
		}
		else
		{
			System.out.println("No pan present in given ID");
		}

	}

}
