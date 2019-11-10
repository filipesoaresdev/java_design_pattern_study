package com.futureday.java_design_patterns.behavioral.bridge;

/**
 * An interface that will be implemented by concrete classes. Theses classes 
 * will define define the methods to be used by the Abstration Class FifoCollection
 * @author FilipeSoares-STI
 */
public interface LinkedList<T> {
    
    void addFirst(T element);
    
    T removeFirst();
    
    void addLast(T element);
    
    T removeLast();
    
    int getSize();
    
}
