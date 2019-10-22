/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.abstractfactory.factory;

import com.futureday.java_design_patterns.abstractfactory.model.google.GoogleComputerEngineInstance;
import com.futureday.java_design_patterns.abstractfactory.model.google.GoogleCloudStorage;
import com.futureday.java_design_patterns.abstractfactory.model.Storage;
import com.futureday.java_design_patterns.abstractfactory.model.Instance;

/**
 * Concrete class of Google Cloud Platform that implements the ResourceFactory
 * @author FilipeSoares-STI
 */
public class GoogleResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputerEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
    
}
