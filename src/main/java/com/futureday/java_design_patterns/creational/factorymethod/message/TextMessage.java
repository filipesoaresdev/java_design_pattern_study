package com.futureday.java_design_patterns.creational.factorymethod.message;

/**
 *
 * @author FilipeSoares-STI
 */
public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "Text";
    }
    
}
