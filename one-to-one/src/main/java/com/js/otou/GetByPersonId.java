package com.js.otou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByPersonId {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class, 1);
		if(p!=null)
		{
			System.out.println("person name:"+p.getName());
			System.out.println("person email:"+p.getEmail());
			System.out.println("person phone:"+p.getPhone());
			Pan pan=p.getPan();
			if(pan!=null)
			{
				System.out.println("Pan Number:"+pan.getPanNumber());
				System.out.println("DOB:"+pan.getDob());
			}
			else
			{
				System.out.println("Pan details not added");
			}
		}else {
			System.out.println("No Person with Given Id");
		}
		
		

	}

}
