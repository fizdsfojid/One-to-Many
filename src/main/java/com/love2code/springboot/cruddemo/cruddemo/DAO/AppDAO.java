package com.love2code.springboot.cruddemo.cruddemo.DAO;

import com.love2code.springboot.cruddemo.cruddemo.entity.Course;
import com.love2code.springboot.cruddemo.cruddemo.entity.instructor;


import java.util.List;


public interface AppDAO  {

   void save(instructor theInstructor);

   instructor findInstructorById(int theInstructor);

   void delete(int theInstructorId);

   List<Course> findCoursesByInstructorId(int theInstructorId);

   instructor findInstructorByIdJoinFetch(int instructorId);

   void updateInstructor(instructor theInstructor);

   void updateCourse(Course theCourse);

   Course findCourseById(int theCourseId);

   void deleteInstructorById(int theInstructorId);

   void deleteCourseById(int theCourseId);
}
