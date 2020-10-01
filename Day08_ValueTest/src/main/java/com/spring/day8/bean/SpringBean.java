package com.spring.day8.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
public class SpringBean {
    @Value("Zin Ko Winn")
    private String name;
    @Value("#{'Zaya Minglar 1st street'.toUpperCase()}")
    private String streetName;
    @Value("true")
    private boolean accountExits;
    @Value("2000")
    private  int intNumber;
    @Value("#{2002 * 0.3}")
    private  float accountBalance;
    @Value("${app.department.id}")
    private int departmentId;
    @Value("#{'${app.department.name}'.toUpperCase()}")
    private String departmentName;

    private String managerName;
    private String supportContactMail;
    private String supportPhone;
    private String supportAddress;
   @Value("${app.dependent.departments}")
    private String [] dependentDepartments;
   @Value("${app.case.id}")
    private List<Integer> caseIds;
   @Value("${app.cases.set}")
    private Set<String> caseSet;
    @Value("#{${app.cases.map}}")
    private Map<String,Integer> caseMap;
    /*
    @Value("#{springBean2.taxValue}")
    private int taxValue;
    */
    public SpringBean( @Value("#{'${app.department.manager}'.toUpperCase()}") String managerName){
        this.managerName = managerName;
    }
    @Value("${app.support.contact}")
    public void setSupportContactMail(String supportContactMail){
        this.supportContactMail = supportContactMail;
    }
 @Autowired
    public void setSupportPhoneAndAddress(@Value("${app.support.phone}") String supportPhone, @Value("${app.support.address}") String supportAddress){
        this.supportPhone = supportPhone;
        this.supportAddress = supportAddress;
    }

    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public boolean isAccountExits() {
        return accountExits;
    }

    public int getIntNumber() {
        return intNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getSupportContactMail() {
        return supportContactMail;
    }

    public String getSupportPhone() {
        return supportPhone;
    }

    public String getSupportAddress() {
        return supportAddress;
    }

    public String[] getDependentDepartments() {
        return dependentDepartments;
    }

    public List<Integer> getCaseIds() {
        return caseIds;
    }

    public Set<String> getCaseSet() {
        return caseSet;
    }

    public Map<String, Integer> getCaseMap() {
        return caseMap;
    }
    /*
    public int getTaxValue(){
        return taxValue;
    }
    */
}
