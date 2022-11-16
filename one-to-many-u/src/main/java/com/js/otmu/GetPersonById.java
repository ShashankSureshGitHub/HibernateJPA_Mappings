package com.js.otmu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GetPersonById {
	
	public static void main(String []args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Person p=em.find(Person.class, 1);
		if(p!=null)
		{
			System.out.println("person name:"+p.getName());
			System.out.println("person email:"+p.getEmail());
			System.out.println("person phone:"+p.getPhone());
			List<BankAccount>bA=p.getbA();
			if(bA.size()>0)
			{
			for(BankAccount b:bA)
			{
				System.out.println("====================================");
				System.out.println("Account Number:"+b.getAccountNumber());
				System.out.println("IFSC Code"+b.getiFSC());
			}
			}else
			{
				System.out.println("No Bank Account for this person");
			}
		}else {
			System.out.println("No Person with Given Id");
		}
		
	}

}
