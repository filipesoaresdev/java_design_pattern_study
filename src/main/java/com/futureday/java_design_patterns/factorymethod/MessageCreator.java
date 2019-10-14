/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.factorymethod;

import com.futureday.java_design_patterns.factorymethod.message.Message;

/**
 *
 * @author FilipeSoares-STI
 * 
 * This is the abstract class that will be used by the creator classes
 * to generate a message
 */
//
public abstract class MessageCreator {
    
    //generate the message using the factory method implemented by the subclasses
    public Message getMessage(){
        
       Message msg = createMessage();
       msg.addDefaultHeaders();
       msg.encrypt();
       
       return msg;
    }
    
    //Factory Method
    //implemented by subclass creator methods
    public abstract Message createMessage();
    
}
