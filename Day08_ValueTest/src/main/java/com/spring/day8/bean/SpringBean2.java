package com.spring.day8.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean2 {
    @Value("3")
    private Integer taxId;
    @Value("#{${app.tax.value}/100.0}")
    private float taxValue;
    @Value("${app.tax.department.name}")
    private String taxDepartmentName;
    @Value("${app.tax.department.alter.name:no_name}")
    private String taxDepartmentAlterName;

    public Integer getTaxId() {
        return taxId;
    }

    public float getTaxValue() {
        return taxValue;
    }

    public String getTaxDepartmentName() {
        return taxDepartmentName;
    }

    public String getTaxDepartmentAlterName() {
        return taxDepartmentAlterName;
    }


}
