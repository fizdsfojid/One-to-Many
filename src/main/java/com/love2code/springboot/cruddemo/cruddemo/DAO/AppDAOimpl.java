package com.love2code.springboot.cruddemo.cruddemo.DAO;

import com.love2code.springboot.cruddemo.cruddemo.entity.Course;
import com.love2code.springboot.cruddemo.cruddemo.entity.instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDAOimpl implements AppDAO {

    private EntityManager entityManager;

    @Autowired
    public AppDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(instructor theInstructor) {
        entityManager.persist(theInstructor);

    }
    //cmd + click on mouse


    @Override
    public instructor findInstructorById(int theInstructor) {
        return entityManager.find(instructor.class, theInstructor);
    }

    @Transactional
    @Override
    public void delete(int theInstructorId) {
        entityManager.remove(entityManager.find(instructor.class, theInstructorId));

    }

    @Override
    public List<Course> findCoursesByInstructorId(int theInstructorId) {
        TypedQuery<Course> query = entityManager.createQuery("from Course where instructor.id = :data", Course.class);
        query.setParameter("data", theInstructorId);
        return query.getResultList();
    }

    @Override
    public instructor findInstructorByIdJoinFetch(int instructorId) {
        TypedQuery<instructor> query = entityManager.createQuery(
                "select i from instructor i "
                        + "JOIN FETCH i.courses"
                        + " WHERE i.id = :data", instructor.class
        );
        query.setParameter("data", instructorId);
        instructor Instructor = query.getSingleResult();
        return Instructor;
    }

    @Override
    @Transactional
    public void updateInstructor(instructor theInstructor) {
        entityManager.merge(theInstructor);

    }

    @Override
    @Transactional
    public void updateCourse(Course theCourse) {
        entityManager.merge(theCourse);
    }

    @Override
    public Course findCourseById(int theCourseId) {
        return entityManager.find(Course.class, theCourseId);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int theInstructorId) {
        instructor theInstructor = entityManager.find(instructor.class, theInstructorId);

        List<Course> courses = theInstructor.getCourses();
        for (Course course : courses) {
            entityManager.remove(course);
        }

        entityManager.remove(theInstructor);
    }

    @Override
    @Transactional
    public void deleteCourseById(int theCourseId) {
        Course theCourse = entityManager.find(Course.class, theCourseId);
        entityManager.remove(theCourse);
    }
}
