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
public abstract class GameUnit {
    
    private Point3D position;
    
    public GameUnit(){
        
        position = Point3D.ZERO;
        
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
    
}
