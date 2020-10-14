package com.spring.day16.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee {
    private int employeeId;
    private String name;
    private int age;
    private Date hire_date;
    private String contact_email;
    private String contact_phone;
    private int salary;

}
