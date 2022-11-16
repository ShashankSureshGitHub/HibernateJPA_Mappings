package com.js.bi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteByMobileId {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Mobile m=em.find(Mobile.class, 1);
		if(m!=null)
		{
			et.begin();
			List<Sim> sim=m.getSims();
			if(sim.size()>0)
			{
				for(Sim s:sim)
				{
					em.remove(s);
				}
			}
			em.remove(m);
			et.commit();
			System.out.println("Successfully deleted");
		}
		else
		{
			System.out.println("No mobile for the given Id");
		}
	}

}
