package com.futureday.java_design_patterns.factorymethod.message;

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
