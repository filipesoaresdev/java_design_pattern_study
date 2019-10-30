
package com.futureday.java_design_patterns.creational.abstractfactory.model.aws;

import com.futureday.java_design_patterns.creational.abstractfactory.model.Instance;
import com.futureday.java_design_patterns.creational.abstractfactory.model.Storage;

/**
 *This class represents a concrete object that implements Instance - "EC2 - Amazon"
 * @author FilipeSoares-STI
 */
public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity){
        System.out.println("Ec2 created");
    }
    
    
    @Override
    public void start() {
        System.out.println("Ec2 started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " +storage+ " to Ec2");
    }

    @Override
    public void stop() {
        System.out.println("Ec2 stopped");
    }

    @Override
    public String toString() {
        return "Ec2 Instance";
    }
    
    
    
}
