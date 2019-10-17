/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.prototype;

import javafx.geometry.Point3D;

/**
 *
 * @author Filipe
 */
public abstract class GameUnit implements Cloneable{
    
    private Point3D position;
    
    public GameUnit(){
        
        this.position = Point3D.ZERO;
        
    }
    
    public GameUnit(float x, float y, float z){
        position = new Point3D(x, y, z);
    }
    
    public void move(Point3D direction, float distance){
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }
    
    public Point3D getPosition(){
        return position;
    }

    
    //initialization of the object
    protected void init(){
        this.position = Point3D.ZERO;
        reset();
    }
    
    //An abstract method to be implemented by subclasse
    //the init() uses this method to initialize 
    protected abstract void reset();
    
    
    //It implements a shallow copy using the super.clone()
    //and initializing with init() method
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        
        GameUnit unit = (GameUnit)super.clone();
        unit.init();
        
        return unit;
    }
    
    
}
