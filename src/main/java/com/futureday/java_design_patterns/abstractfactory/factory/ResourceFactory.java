package com.futureday.java_design_patterns.abstractfactory.factory;

import com.futureday.java_design_patterns.abstractfactory.model.Storage;
import com.futureday.java_design_patterns.abstractfactory.model.Instance;

/**
 * Interface declaring the methods which must be implemented for each
 * factory
 * @author FilipeSoares-STI
 */
public interface ResourceFactory {
    
    Instance createInstance(Instance.Capacity capacity);
    
    Storage createStorage(int capMib);
    
}
