package com.futureday.java_design_patterns.creational.singleton.lazy;

/**
 *
 * @author FilipeSoares-STI
 */
public class Client {
    
    public static void main(String[] args) {
        
        LazyRegistryWithDCL lazy1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazy2 = LazyRegistryWithDCL.getInstance();
        
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        
        LazyRegistryIODH lazyIODH1;
        lazyIODH1 = LazyRegistryIODH.getInstance(); //only here will print the constructor
        lazyIODH1 = LazyRegistryIODH.getInstance();
        lazyIODH1 = LazyRegistryIODH.getInstance();
        lazyIODH1 = LazyRegistryIODH.getInstance();
        lazyIODH1 = LazyRegistryIODH.getInstance();
        
        
    }
    
}
