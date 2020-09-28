package com.spring.day2;

public class Student {
    String name = "Zin Ko Winn";
    int age = 18;
    String school = "Yangon";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String showInfo() {

        return "name = '" + name + '\'' + ", age = " + age + ", school = '" + school + '\'' ;
    }

}
