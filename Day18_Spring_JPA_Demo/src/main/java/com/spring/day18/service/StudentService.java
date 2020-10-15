package com.spring.day18.service;

import com.spring.day18.dao.StudentDao;
import com.spring.day18.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class StudentService {
   private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPU");
   private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    StudentDao std = new StudentDao(entityManager);
    Scanner input = new Scanner(System.in);

    public void insert() {
        System.out.println("<====== Inserting ======>");
        System.out.println("Please enter student name  : ");
        String name = input.nextLine();
        System.out.println("Please enter student age : ");
        int age = Integer.valueOf(input.nextLine());
        System.out.println("Please enter student phone : ");
        String phone = input.nextLine();
        System.out.println("Please enter school : ");
        String school = input.nextLine();
        std.insertStudent(new Student(name, age, phone, school));
        System.out.println("Inserted into database : " + "\n" + "Name :" + name + "\n" + "Age : " + age + "Phone : " + phone + "School : " + school);
        System.out.println();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void update() {
        System.out.println("<====== Updating ======>");
        System.out.println("Please enter student id to update : ");
        int id = Integer.valueOf(input.nextLine());
        System.out.println("Please enter student name to update : ");
        String name = input.nextLine();
        std.updateStudent(id, name);
        System.out.println(" Updated Student" + "\n" + "Id : " + id + "\n" + "Name : " + name);
        System.out.println();
        entityManager.close();
        entityManagerFactory.close();
    }


    public void delete() {
        System.out.println("<====== Deleting ======>");
        System.out.println("Please enter student id to delete : ");
        int id = Integer.valueOf(input.nextLine());
        std.deleteStudent(id);
        System.out.println("Deleted Student :");
        System.out.println();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void findById() {
        System.out.println("<====== Finding ======>");
        System.out.println("Please enter student id to find student by Id : ");
        int id = Integer.valueOf(input.nextLine());
        Student student = std.findById(id);
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("School : " + student.getSchool());
        System.out.println();
        entityManager.close();
        entityManagerFactory.close();
    }

}
