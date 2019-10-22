/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.singleton.eager;

/**
 *Eager initialization of singleton
 * Which means that the instance is created when the class is loaded.
 * @author FilipeSoares-STI
 */
public class EagerRegistry {

    //This makes the class impossible to be initialized out of the class
    private EagerRegistry() {
        System.out.println("Eager initialization");
    }
    
    private static final EagerRegistry INSTANCE = new EagerRegistry();
    
    public static EagerRegistry getInstance(){
        
        return INSTANCE;
        
    }
}
