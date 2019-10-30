package com.futureday.java_design_patterns.creational.factorymethod.message;

/**
 *
 * @author FilipeSoares-STI
 */
public class JSONMessage extends Message{

    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }
    
    
    
}
