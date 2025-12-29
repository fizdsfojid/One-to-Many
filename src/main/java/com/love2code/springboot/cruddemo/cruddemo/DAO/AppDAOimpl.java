package com.love2code.springboot.cruddemo.cruddemo.DAO;

import com.love2code.springboot.cruddemo.cruddemo.entity.instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
        this.entityManager.persist(theInstructor);

    }

    @Override
    public instructor findInstructorById(int theInstructor) {
        return entityManager.find(instructor.class, theInstructor);
    }

    @Transactional
    @Override
    public void delete(int theInstructorId) {
        entityManager.remove(entityManager.find(instructor.class, theInstructorId));

    }
}
