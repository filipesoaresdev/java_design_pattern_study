package com.futureday.java_design_patterns.behavioral.decorator;

/**
 *
 * This is the original class. The msg String will be changed by the decorators.
 * 
 * @author Filipe
 */
public class TextMessage implements Message{

    private String msg;
    
    public TextMessage(String msg){
        this.msg = msg;
    }
    
    @Override
    public String getContent() {
        return msg;
    }
    
    
    
}
