package com.love2code.springboot.cruddemo.cruddemo.DAO;

import com.love2code.springboot.cruddemo.cruddemo.entity.instructor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppDAO  {

   void save(instructor theInstructor);

   instructor findInstructorById(int theInstructor);

   void delete(int theInstructorId);
}
