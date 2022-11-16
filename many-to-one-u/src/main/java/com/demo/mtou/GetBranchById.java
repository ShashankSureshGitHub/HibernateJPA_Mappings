package com.demo.mtou;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetBranchById {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Branch b=em.find(Branch.class, 5);
		if(b!=null)
		{
			System.out.println("Branch name "+b.getName());
			System.out.println("Branch address "+b.getAddress());
			System.out.println("pin code "+b.getPincode());
			Company c=b.getCompany();
			if(c!=null)
			{
				System.out.println("company name "+c.getName());
				System.out.println("Company gst code "+c.getGst());
			}
			else
			{
				System.out.println("No company");
			}
		}else
		{
			System.out.println("No branch in the given id");
		}
	}

}
