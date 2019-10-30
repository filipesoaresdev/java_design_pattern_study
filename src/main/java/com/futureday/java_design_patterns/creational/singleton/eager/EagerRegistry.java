package com.futureday.java_design_patterns.creational.singleton.eager;

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
