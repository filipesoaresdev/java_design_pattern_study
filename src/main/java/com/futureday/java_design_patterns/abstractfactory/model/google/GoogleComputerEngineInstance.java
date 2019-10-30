package com.futureday.java_design_patterns.abstractfactory.model.google;

import com.futureday.java_design_patterns.abstractfactory.model.Instance;
import com.futureday.java_design_patterns.abstractfactory.model.Storage;

/**
 *
 * @author FilipeSoares-STI
 */
public class GoogleComputerEngineInstance implements Instance{

    public GoogleComputerEngineInstance(Capacity capacity) {
    
        System.out.println("Google Computer Engine instance created");
    }
    
    @Override
    public void start() {
        System.out.println("Google Computer Engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println(" Attached "+ storage+ " to Google Computer Engine");
    }

    @Override
    public void stop() {
        System.out.println("Google Computer Engine instance stopped");
    }

    @Override
    public String toString() {
        return "Google Compute engine instance stopped";
    }
    
    
    
}
