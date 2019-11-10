package com.futureday.java_design_patterns.behavioral.bridge;

/**
 * An abstration class that represents a first in first out collection
 * @author FilipeSoares-STI
 */
public interface FifoCollection<T> {
    //add elements
    void offer(T element);
    //remove and returns first element
    T poll();
    
}
