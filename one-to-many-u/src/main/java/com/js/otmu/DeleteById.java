package com.js.otmu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteById {

	public static void main(String[] args) {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("uday"); // to create entity manager entity we need EMF
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			Person p=em.find(Person.class,1);
			if(p!=null)
			{
				List<BankAccount> bA=p.getbA();
				if(bA.size()>0)
				{
					et.begin();
					for(BankAccount b:bA)
					{
					em.remove(b);
					}
					em.remove(p);
					et.commit();
				}
				else
				{
					
					System.out.println("Person has no bank accounts");
				}
			}
			else
			{
				System.out.println("No person in the given ID");
			}
			
	}

}
