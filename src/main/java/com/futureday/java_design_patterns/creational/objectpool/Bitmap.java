/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.creational.objectpool;

import javafx.geometry.Point2D;

/**
 *
 * @author FilipeSoares-STI
 */
public class Bitmap implements Image{

    private Point2D location;
    
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing "+ name+" @ "+ location);
    }

    @Override
    public Point2D getLocaltion() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reseted");
    }
    
}
