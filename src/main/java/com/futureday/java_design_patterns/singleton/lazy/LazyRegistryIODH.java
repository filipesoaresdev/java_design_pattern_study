/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.singleton.lazy;

/**
 * Singleton pattern using Lazy initialization
 * Without worrying about synchronization
 * The class is initialized only once in the first time it is referenced, as we
 * can see in the example at Client class example.
 * @author FilipeSoares-STI
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("IODH Instantiated");
    }
    
    private static class RegistryHolder{
        
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }
    
    public static LazyRegistryIODH getInstance(){
        
        return RegistryHolder.INSTANCE;
    }
}
