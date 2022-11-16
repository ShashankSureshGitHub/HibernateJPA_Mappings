package com.js.otmu;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonBankAccount {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=new Person();
		BankAccount b=new BankAccount();
		BankAccount b1=new BankAccount();
		List<BankAccount> bA=new ArrayList<BankAccount>();
		p.setName("shank");
		p.setEmail("shank@gmail.com");
		p.setPhone(8787878765l);
		b.setAccountNumber(897656754563l);
		b.setiFSC("6757ACHG5646");
		b1.setAccountNumber(987687654321l);
		b1.setiFSC("8767ASCH5543");
		
		bA.add(b);
		bA.add(b1);
		p.setbA(bA);
		
		et.begin();
		em.persist(p);
		et.commit();
	}

}
