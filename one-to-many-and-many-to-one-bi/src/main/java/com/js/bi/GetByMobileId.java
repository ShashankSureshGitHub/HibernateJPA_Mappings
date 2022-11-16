package com.js.bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GetByMobileId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		
		Mobile m=em.find(Mobile.class, 1);
		if(m!=null)
		{
			System.out.println("Mobile name "+m.getMobileName());
			System.out.println("Mobile Brand "+m.getBrand());
			System.out.println("Mobile Price "+m.getPrice());
			List<Sim> sims=m.getSims();
			if(sims.size()>0)
			{
			for(Sim s:sims)
			{
				System.out.println("Sim provider "+s.getProvider());
				System.out.println("Sim type "+s.getType());
			}
			System.out.println("Successfully printed Mobile and sims");
			}else
			{
				System.out.println("No sims associated with the mobile");
			}
		}else
		{
		System.out.println("No person for the given Id");
		}
	}

}
