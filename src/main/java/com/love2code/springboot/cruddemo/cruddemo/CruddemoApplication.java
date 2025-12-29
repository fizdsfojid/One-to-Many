package com.love2code.springboot.cruddemo.cruddemo;

import com.love2code.springboot.cruddemo.cruddemo.DAO.AppDAO;
import com.love2code.springboot.cruddemo.cruddemo.entity.instructor;
import com.love2code.springboot.cruddemo.cruddemo.entity.instructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner ->
				//createInstructor(appDAO);
		        //findInstructor(appDAO);
		        deleteInstructor(appDAO);

	}

	private void deleteInstructor(AppDAO appDAO) {
		int theInstructorId = 3;
		appDAO.delete(theInstructorId);
		System.out.println("Instructor deleted successfully: " + theInstructorId);
	}
//
//	private void findInstructor(AppDAO appDAO) {
//		int theInstructorId = 1;
//		System.out.println("Finding instructor with id " + theInstructorId);
//		instructor tempIns = appDAO.findInstructorById(theInstructorId);
//		System.out.println("the instructor id: " + tempIns);
//		System.out.println("detail: " +  tempIns.getInstructorDetail());
//
//	   }
//	}

//	private void createInstructor(AppDAO appDAO) {
//		instructor tempInstructor = new instructor("ivan", "shemshur", "boss");
//		instructorDetail ins = new instructorDetail("coding", "http:// www.luv2code.com/youtube");
//		tempInstructor.setInstructorDetail(ins);
//		System.out.println("Instructor created: " + tempInstructor);
//		appDAO.save(tempInstructor);
//
//		instructor tempInstructor = new instructor("ivan1", "shemshur1", "boss1");
//		instructorDetail ins = new instructorDetail("coding1", "http://www.luv2code.com/youtube1");
//		tempInstructor.setInstructorDetail(ins);
//		System.out.println("Instructor created: " + tempInstructor);
//		appDAO.save(tempInstructor);
//	}

}
