/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.abstractfactory;

import com.futureday.java_design_patterns.abstractfactory.factory.ResourceFactory;
import com.futureday.java_design_patterns.abstractfactory.factory.GoogleResourceFactory;
import com.futureday.java_design_patterns.abstractfactory.factory.AwsResourceFactory;
import com.futureday.java_design_patterns.abstractfactory.model.Storage;
import com.futureday.java_design_patterns.abstractfactory.model.Instance;

/**
 * This is the Client class to demonstrate the Abstract Factory
 * To create a Resource, we first instantiate a client using the
 * respective parameter 
 * -- AwsResrouceFactory to instantiate the classes from Aws 
 * -- GoogleResourceFactory to the google classes
 * Each factory has the definition to create an Instance and a Storage.
 * These methods are implemented from ResourceFactory interface.
 * 
 * Abstract Factory works usually together with factory methods
 * It's used when we must separate models in sets of families, not necessarily
 * between super classes and sub classes.  
 * 
 * @author FilipeSoares-STI
 */
public class Client {
    
    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }
    
    public Instance createServer(Instance.Capacity cap, int storageMib){
        
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
        
    }
    
    public static void main(String[] args) {
        
        Client aws = new Client(new AwsResourceFactory());
        
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();
        
        System.out.println("_____________________");
        
        Client google = new Client(new GoogleResourceFactory());
        i1 = google.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();
        
    }
    
}
