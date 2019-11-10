package com.futureday.java_design_patterns.behavioral.decorator;

import java.util.Base64;

/**
 *  This class slightly changes the message. 
 * The change must not modify too much the content
 * @author Filipe
 */
public class Base64EncodedMessage implements Message{

    private Message msg;

    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }
    
    
    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
    
}
