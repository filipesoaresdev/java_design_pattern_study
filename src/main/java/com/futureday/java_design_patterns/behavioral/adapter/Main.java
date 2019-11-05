package com.futureday.java_design_patterns.behavioral.adapter;

import com.futureday.java_design_patterns.behavioral.adapter.class_adapter.BusinessCardDesigner;
import com.futureday.java_design_patterns.behavioral.adapter.class_adapter.Employee;
import com.futureday.java_design_patterns.behavioral.adapter.class_adapter.EmployeeClassAdapter;
import com.futureday.java_design_patterns.behavioral.adapter.object_dapter.EmployeeObjectAdapter;

/**
 *
 * @author FilipeSoares-STI
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Using class adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        
        System.out.println();
        
        //Using object adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);
    }
    
    private static void populateEmployeeData(Employee employee){
        
        employee.setFullName("Filipe Soares");
        employee.setJobTitle("Java Web Developer");
        employee.setOfficeLocation("UFPI , Teresina, Piauí");
        
    }
    
}
