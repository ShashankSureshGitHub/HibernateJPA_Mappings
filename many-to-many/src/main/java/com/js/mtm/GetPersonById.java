package com.js.mtm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class, 1);
		{
			if(p!=null)
			{
				System.out.println("Person name "+p.getPersonName());
				System.out.println("Person email "+p.getEmail());
				System.out.println("Person phone number "+p.getPhoneNumber());
				
				List<Cab> cabs=p.getCabs();
				if(cabs.size()>0)
				{
					for(Cab c:cabs)
					{
						System.out.println("Cab driver Name "+c.getDriverName());
						System.out.println("Cab price "+c.getPrice());
					}
				}
				else {
						System.out.println("No Cabs");
					}
			}else
			{
				System.out.println("No person for the given id");
			}
		}
	}
}
