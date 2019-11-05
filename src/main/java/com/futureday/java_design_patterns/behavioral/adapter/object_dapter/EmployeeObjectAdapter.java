package com.futureday.java_design_patterns.behavioral.adapter.object_dapter;

import com.futureday.java_design_patterns.behavioral.adapter.class_adapter.Customer;
import com.futureday.java_design_patterns.behavioral.adapter.class_adapter.Employee;

/**
 *
 * @author FilipeSoares-STI
 */
public class EmployeeObjectAdapter implements Customer{

    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }
    
    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
    
}
