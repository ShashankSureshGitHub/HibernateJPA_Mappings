package com.js.mtmb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByCourseId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Course c=em.find(Course.class, 1);
		if(c!=null)
		{
			System.out.println("Course name "+c.getCourseName());
			System.out.println("Course price "+c.getFee());
		
			List<Student> students=c.getStudents();
			if(students.size()>0)
			{
				for(Student s:students)
				{
					System.out.println("====================================");
					System.out.println("student's name "+ s.getStudentName());
					System.out.println("student's age "+s.getAge());
					System.out.println("student's phone number "+s.getPhoneNumber());
				}
				System.out.println("Course and student details printed successfully");	
			}
			else
			{
				System.out.println("Student hasnt enrolled to this course");
			}
		}
		else
		{
			System.out.println("No course for given Id");
		}

	}

}
