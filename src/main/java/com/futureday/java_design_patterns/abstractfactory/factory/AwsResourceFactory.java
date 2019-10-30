package com.futureday.java_design_patterns.abstractfactory.factory;

import com.futureday.java_design_patterns.abstractfactory.model.aws.S3Storage;
import com.futureday.java_design_patterns.abstractfactory.model.Storage;
import com.futureday.java_design_patterns.abstractfactory.model.Instance;
import com.futureday.java_design_patterns.abstractfactory.model.aws.Ec2Instance;

/**
 * Concrete class of the factory to build the Aws resources 
 * - Implements Resource Factory
 * @author FilipeSoares-STI
 */
public class AwsResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new  Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
    
}
