package com.futureday.java_design_patterns.creational.factorymethod;

import com.futureday.java_design_patterns.creational.factorymethod.message.Message;
import com.futureday.java_design_patterns.creational.factorymethod.message.TextMessage;

/**
 *
 * @author FilipeSoares-STI
 */
public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
    
}
