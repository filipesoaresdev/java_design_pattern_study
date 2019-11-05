package com.futureday.java_design_patterns.behavioral.adapter.class_adapter;

/**
 * An existing class
 * 
 * @author FilipeSoares-STI
 */
public class Employee {
    
    private String fullName;
    private String jobTitle;
    private String officeLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
    
    
    
    
}
