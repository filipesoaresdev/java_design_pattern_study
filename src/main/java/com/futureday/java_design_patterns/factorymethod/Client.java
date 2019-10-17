/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.factorymethod;

import com.futureday.java_design_patterns.factorymethod.message.Message;

/**
 * This client demonstrate the use of an Factory Method. We are going to 
 * send a message which can be a JSON message or a Text message.
 * 
 * 1 - Firstly, is created an abstract class called MessageCreator. This class has
 * the factory method (abstract) called createMessage() and a public method to 
 * get the message.
 * 2 - We have two classes of Message (JSONMessage and TextMessage) which 
 * extend from Message;
 * 3 - So, we can have multiple classes implementing MessageCreator. In this 
 * case they are JSONMessageCreater and TextMessageCreater. These classes 
 * implement the createMessage() returning the class of the respective messages.
 * 4 - This client print each message calling a unique method 
 * printMessage(MessageCreator messageCreator) that call the getMessage() 
 * method. The type of message creator is determined when calling this method, 
 * passing as parameter the specific subclass of MessageCreator
 *
 * @author FilipeSoares
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
