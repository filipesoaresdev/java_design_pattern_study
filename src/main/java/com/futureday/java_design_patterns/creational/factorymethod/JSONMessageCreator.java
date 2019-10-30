package com.futureday.java_design_patterns.creational.factorymethod;

import com.futureday.java_design_patterns.creational.factorymethod.message.JSONMessage;
import com.futureday.java_design_patterns.creational.factorymethod.message.Message;

/**
 *
 * @author FilipeSoares-STI
 */
public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        
        return new JSONMessage();
        
    }
    
    
    
}
