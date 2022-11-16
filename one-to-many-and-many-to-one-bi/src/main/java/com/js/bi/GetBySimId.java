package com.js.bi;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBySimId {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Sim s=em.find(Sim.class, 1);
		if(s!=null)
		{
			System.out.println("Sim provider "+s.getProvider());
			System.out.println("Sim Type "+s.getType());
			
			Mobile m=s.getMobile();
			if(m!=null)
			{
				System.out.println("Mobile name "+m.getMobileName());
				System.out.println("Mobile Brand "+m.getBrand());
				System.out.println("Mobile Price "+m.getPrice());
			
			System.out.println("Sim and Mobile printed succesfully");
			}
			else
			{
				System.out.println("No mobile");
			}
		}else
		{
			System.out.println("No sim with the given id");
		}
	}

}
