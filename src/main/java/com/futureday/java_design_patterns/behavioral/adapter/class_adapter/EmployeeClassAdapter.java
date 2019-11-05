package com.futureday.java_design_patterns.behavioral.adapter.class_adapter;

/**
 * Adapter implementation
 * Extends Employee in order to get the required methods
 * Implements Customer to be used by the client
 * @author FilipeSoares-STI
 */
public class EmployeeClassAdapter extends Employee implements Customer{

    
    @Override
    public String getName() {
        return getFullName();
    }

    @Override
    public String getDesignation() {
        return getJobTitle();
    }

    @Override
    public String getAddress() {
        return getOfficeLocation();
    }
    
    
    
}
