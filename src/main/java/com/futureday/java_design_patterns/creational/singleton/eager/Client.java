package com.futureday.java_design_patterns.creational.singleton.eager;

/**
 *
 * @author FilipeSoares-STI
 */
public class Client {
    
    //This can't be done.
    //EagerRegistry registry = new EagerRegistry();
    
    public static void main(String[] args) {
    
        EagerRegistry registry1 = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry1);
        System.out.println(registry2);
        System.out.println(registry1 == registry2); // they are the same
    }
    
    
    
}
