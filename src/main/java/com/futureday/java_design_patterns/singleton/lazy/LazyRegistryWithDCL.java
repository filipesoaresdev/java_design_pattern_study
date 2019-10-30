package com.futureday.java_design_patterns.singleton.lazy;

/**
 *
 * Class singleton pattern - Using Double Checked Locking
 * Lazy initialization
 * 
 * @author FilipeSoares-STI
 */
public class LazyRegistryWithDCL {
    
        //Making sure that nobody can create an instance
        private LazyRegistryWithDCL(){
            
        }
        
        private static volatile LazyRegistryWithDCL INSTANCE; 
        
        public static LazyRegistryWithDCL getInstance(){
            if(INSTANCE == null){
                //This resolve the problem of multiple simultaneous calls.
                synchronized(LazyRegistryWithDCL.class){
                    //Double Checking Locking
                    if(INSTANCE == null){
                        INSTANCE = new LazyRegistryWithDCL();
                    }
                }
            }
            return INSTANCE;
        }
        
        
    
}
