package com.love2code.springboot.cruddemo.cruddemo.DAO;

import com.love2code.springboot.cruddemo.cruddemo.entity.instructor;


public interface AppDAO {

   void save(instructor theInstructor);

   instructor findInstructorById(int theInstructor);

   void delete(int theInstructorId);
}
