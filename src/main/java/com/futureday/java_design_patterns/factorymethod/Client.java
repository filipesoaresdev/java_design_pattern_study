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
 */
public class Client {
    
    
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    //Method to print the object
    private static void printMessage(MessageCreator messageCreator) {
        Message msg = messageCreator.getMessage();
        System.out.println(msg);
    }
    
}
