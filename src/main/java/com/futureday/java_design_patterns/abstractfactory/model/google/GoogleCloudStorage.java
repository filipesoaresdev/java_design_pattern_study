package com.futureday.java_design_patterns.abstractfactory.model.google;

import com.futureday.java_design_patterns.abstractfactory.model.Storage;

/**
 *
 * @author FilipeSoares-STI
 */
public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int capacityInMib) {
    
        System.out.println("Allocated "+capacityInMib+" on Google Cloud Storage");
        
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google cloud Storage";
    }
}
