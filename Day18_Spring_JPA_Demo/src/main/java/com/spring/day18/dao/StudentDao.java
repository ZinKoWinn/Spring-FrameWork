package com.spring.day18.dao;

import com.spring.day18.entity.Student;

import javax.persistence.EntityManager;

public class StudentDao {
    private EntityManager entityManager;

    public StudentDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insertStudent(Student student){
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }

    public void deleteStudent(int id){
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Student.class,id));
        entityManager.getTransaction().commit();
    }

    public void updateStudent(int id,String name){
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class,id);
        student.setName(name);
        entityManager.getTransaction().commit();
    }

    public Student findById(int id){
        return  entityManager.find(Student.class,id);
    }

}
