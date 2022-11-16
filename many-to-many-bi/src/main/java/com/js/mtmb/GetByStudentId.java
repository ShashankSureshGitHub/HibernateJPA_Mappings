package com.js.mtmb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByStudentId {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("uday");
		EntityManager em=emf.createEntityManager();
		Student s=em.find(Student.class, 1);
		if(s!=null)
		{
			System.out.println("student's name "+ s.getStudentName());
			System.out.println("student's age "+s.getAge());
			System.out.println("student's phone number "+s.getPhoneNumber());
			List<Course> courses=s.getCourses();
			if(courses.size()>0)
			{
				for(Course c:courses)
				{
					System.out.println("====================================");
					System.out.println("Course name "+c.getCourseName());
					System.out.println("Course price "+c.getFee());
				}
				System.out.println("Student and his course details printed successfully");
			}
			else
			{
				System.out.println("No courses enrolled");
			}
		}
		else
		{
			System.out.println("No Student for the given Id");
		}

	}

}
