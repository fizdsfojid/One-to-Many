package com.love2code.springboot.cruddemo.cruddemo;

import com.love2code.springboot.cruddemo.cruddemo.DAO.AppDAO;
import com.love2code.springboot.cruddemo.cruddemo.entity.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
		        //deleteInstructor(appDAO);
		        //createInstructorWithCourses(appDAO);
		        //findInstructoorWithCourses(appDAO);
				//findCoursesByInstructorId(appDAO);
				//findInstructorByIdJoinFetch(appDAO);
                //updateInstructor(appDAO);
				//updateCourse(appDAO);
				//deleteInstructorById(appDAO);
		        //deleteCourseById(appDAO);

	}

//	private void deleteCourseById(AppDAO appDAO) {
//		int theId = 10;
//		System.out.println("Deleting course with id " + theId);
//
//		appDAO.deleteCourseById(theId);
//		System.out.println("Deleted course with id " + theId);
//
//	}
//
//	private void deleteInstructorById(AppDAO appDAO) {
//		int theInstructorId = 1;
//		System.out.println("Deleting Instructor with id " + theInstructorId);
//		appDAO.deleteInstructorById(theInstructorId);
//		System.out.println("Deleted");
//	}
//
//	private void updateCourse(AppDAO appDAO) {
//		int theID = 10;
//		System.out.println("Updating course with ID: " + theID);
//
//		Course theCourse = appDAO.findCourseById(theID);
//		System.out.println("Updating course with ID: " + theCourse.getId());
//
//		theCourse.setTitle("Running around");
//
//		appDAO.updateCourse(theCourse);
//
//		System.out.println(theCourse.getTitle());
//	}

//	private void updateInstructor(AppDAO appDAO) {
//		int theInstructorId = 3;
//		System.out.println("Updating instructor with id " + theInstructorId);
//
//		instructor tempInstructor = appDAO.findInstructorById(theInstructorId);
//		System.out.println("Updating instructor with id " + theInstructorId);
//
//		tempInstructor.setFirstName("John");
//		tempInstructor.setLastName("Doe");
//
//		appDAO.updateInstructor(tempInstructor);
//
//		System.out.println("new person's first name is: " + tempInstructor.getFirstName());
//		System.out.println("new person's lastname is: " + tempInstructor.getLastName());
//	}

//	private void findInstructorByIdJoinFetch(AppDAO appDAO) {
//		int theInstructorId = 3;
//		System.out.println("Finding instructor by id " + theInstructorId);
//
//		instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theInstructorId);
//		System.out.println("Found: " + tempInstructor);
//
//	}
//
//	private void findCoursesByInstructorId(AppDAO appDAO) {
//		int id = 3;
//		System.out.println("Finding courses by instructor id " + id);
//
//		List<Course> courses = appDAO.findCoursesByInstructorId(id);
//		System.out.println("Courses: " + courses);
//
//		instructor tempInstructor = appDAO.findInstructorById(id);
//		System.out.println("Instructor detail: " + tempInstructor);
//
//		tempInstructor.setCourses(courses);
//
//	}
//
//	private void findInstructoorWithCourses(AppDAO appDAO) {
//		int theInstructorId = 3;
//		System.out.println("Finding instructor with id " + theInstructorId);
//
//		instructor theInstructor = appDAO.findInstructorById(theInstructorId);
//
//		System.out.println("Found instructor with id " + theInstructorId);
//		System.out.println("Finding instructor detail with id " + theInstructor.getCourses());
//		System.out.println("done");
//	}
//
//	public void createInstructorWithCourses(AppDAO appDAO) {
//		instructor tempInstructor = new instructor("susan", "public", "susan.email");
//		instructorDetail temp = new  instructorDetail("swiming", "susan.youtube");
//
//		tempInstructor.setInstructorDetail(temp);
//
//		Course tempCourse = new Course("plaing footbal");
//		Course tempCourse1 = new Course("plaing basketball");
//
//		tempInstructor.addCourse(tempCourse);
//		tempInstructor.addCourse(tempCourse1);
//
//		System.out.println("Saving Instructor: " +  tempInstructor);
//		appDAO.save(tempInstructor);
//
//	}

//	private void deleteInstructor(AppDAO appDAO) {
//		int theInstructorId = 3;
//		appDAO.delete(theInstructorId);
//		System.out.println("Instructor deleted successfully: " + theInstructorId);
//	}
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
	}


