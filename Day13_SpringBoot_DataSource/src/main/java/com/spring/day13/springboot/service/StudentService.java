package com.spring.day13.springboot.service;

import com.spring.day13.springboot.dao.StudentDao;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void printReportData(){
        System.out.println("<===== Student Info List Is Start =====>");
        studentDao.findClassName().forEach(System.out::println);
        System.out.println("<===== Student Info List Is End =====>");
    }
}

