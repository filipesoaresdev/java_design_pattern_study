/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
