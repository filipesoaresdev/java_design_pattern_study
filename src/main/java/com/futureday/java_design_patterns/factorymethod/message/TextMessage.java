/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
