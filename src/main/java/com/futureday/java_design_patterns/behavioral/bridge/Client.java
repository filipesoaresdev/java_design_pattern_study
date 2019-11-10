package com.futureday.java_design_patterns.behavioral.bridge;

/**
 * Client using the abstraction class
 * It demonstrates the insert and remove methods
 * As we can see, the client don't know any method from "SinglyLinkedList", 
 * but using the FifoCollection abstraction, it can manipulate according to the 
 * provided interface .
 * 
 * @author FilipeSoares-STI
 */
public class Client {
    
    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(50);
        collection.offer(150);
        
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
    }
    
    
}
