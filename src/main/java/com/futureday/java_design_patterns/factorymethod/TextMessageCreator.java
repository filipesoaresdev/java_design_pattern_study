package com.futureday.java_design_patterns.factorymethod;

import com.futureday.java_design_patterns.factorymethod.message.Message;
import com.futureday.java_design_patterns.factorymethod.message.TextMessage;

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
