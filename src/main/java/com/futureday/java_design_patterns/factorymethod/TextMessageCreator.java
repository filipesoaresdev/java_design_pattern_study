/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
