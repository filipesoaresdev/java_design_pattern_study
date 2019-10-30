package com.futureday.java_design_patterns.prototype;

import javafx.geometry.Point3D;

/**
 * Class to demonstrate the prototype pattern.
 * 
 * 1 - Implement an abstract class which implements java.​lang.Cloneable
 * 2 - Multiples classes that extend from the abstract class
 * 2.1 - There is a protected clone() from object that must be overridden as public
 * 3 - These classes override the clone() method as public to generate a new object of the
 * same class with all the attributes restarted
 * 4 - clone() may throws CloneNotSupportedException if not supported
 * 5 - can be a shallow copy or a deep copy
 * 5.1 - shallow copy is the simplest, where we use the default copy().
 * only coping all the fields, even
 * the referenced object. This can be a problem because we are using the same 
 * reference in two different instancies.
 * 5.2 - deep copy that resolve the problem of the shared reference. We 
 * override the copy method, copying manually each object.
 * 
 * @author FilipeSoares-STI
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();
        
        System.out.println(swordsman);
        
        Swordsman swordsman2 = (Swordsman)swordsman.clone();
        
        System.out.println("Clone Swordsman"+swordsman2);
        
    }
}
