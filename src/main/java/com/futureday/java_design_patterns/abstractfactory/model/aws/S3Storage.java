/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.abstractfactory.model.aws;

import com.futureday.java_design_patterns.abstractfactory.model.Storage;

/**
 *
 * @author FilipeSoares-STI
 */
public class S3Storage implements Storage{

    public S3Storage(int capacityInMib) {
    
        System.out.println("Allocated "+ capacityInMib + " on S3");
        
    }
    
    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
