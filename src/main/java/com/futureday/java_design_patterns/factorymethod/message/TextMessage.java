package com.futureday.java_design_patterns.factorymethod.message;

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
