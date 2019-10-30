/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.creational.abstractfactory.model;

/**
 *
 * @author FilipeSoares-STI
 */
public interface Instance {
    
    enum Capacity{micro,small, large};
    void start();
    void attachStorage(Storage storage);
    void stop();
}
