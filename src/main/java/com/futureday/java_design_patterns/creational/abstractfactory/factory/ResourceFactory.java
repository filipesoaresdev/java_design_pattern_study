package com.futureday.java_design_patterns.creational.abstractfactory.factory;

import com.futureday.java_design_patterns.creational.abstractfactory.model.Storage;
import com.futureday.java_design_patterns.creational.abstractfactory.model.Instance;

/**
 * Interface declaring the methods which must be implemented for each
 * factory
 * @author FilipeSoares-STI
 */
public interface ResourceFactory {
    
    Instance createInstance(Instance.Capacity capacity);
    
    Storage createStorage(int capMib);
    
}
