package com.futureday.java_design_patterns.behavioral.adapter.class_adapter;

/**
 * Client code that will print the necessary data from Customer
 * @author FilipeSoares-STI
 */
public class BusinessCardDesigner {
    
    
    public String designCard(Customer customer){
        
        StringBuilder card = new StringBuilder();
        card.append(customer.getName());
        card.append("\n");
        card.append(customer.getDesignation());
        card.append("\n");
        card.append(customer.getAddress());
        
        return card.toString();
    }
    
    
}
