package com.futureday.java_design_patterns.creational.objectpool;

import javafx.geometry.Point2D;

/**
 *This is the reusable abstract item
 * @author FilipeSoares-STI
 */
public interface Image extends Poolable{

    void draw();
    
    Point2D getLocaltion();
    
    void setLocation(Point2D location);
    
}
