package com.spring.day8;

import com.spring.day8.bean.SpringBean;
import com.spring.day8.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        SpringBean springBean = context.getBean(SpringBean.class);
        SpringBean2 springBean2 = context.getBean(SpringBean2.class);
        System.out.println("<========== Spring Bean ==========>");
        System.out.println("getName = " + springBean.getName());
        System.out.println("getStreetName = " + springBean.getStreetName());
        System.out.println("isAccountExist = " + springBean.isAccountExits());
        System.out.println("getIntNumber = " + springBean.getIntNumber());
        System.out.println("getAccountBalance = " + springBean.getAccountBalance());
        System.out.println("getDepartmentId = " + springBean.getDepartmentId());
        System.out.println("getDepartmentName = " + springBean.getDepartmentName());
        System.out.println("getManagerName = " + springBean.getManagerName());
        System.out.println("getSupportContactMail = " + springBean.getSupportContactMail());
        System.out.println("getSupportPhone = " + springBean.getSupportPhone());
        System.out.println("getSupportAddress = " + springBean.getSupportAddress());
        System.out.println("getDependentDepartments = " + Arrays.toString(springBean.getDependentDepartments()));
        System.out.println("getCaseIds = " + springBean.getCaseIds());
        System.out.println("getCaseSet = " + springBean.getCaseSet());
        System.out.println("getCaseMap = " + springBean.getCaseMap());
        /*
       System.out.println("getTaxValue = " + springBean.getTaxValue());

        System.out.println();

       System.out.println("<========== Spring Bean2 ==========>");
        System.out.println("getTaxId = " + springBean2.getTaxId());
        System.out.println("getTaxValue = " + springBean2.getTaxValue());
        System.out.println("getTaxDepartmentName = " + springBean2.getTaxDepartmentName());
        System.out.println("getTaxDepartmentAlterName = " + springBean2.getTaxDepartmentAlterName());

         */
    }
}
