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
public class Client {
    
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("Logo.bmp"), 5 );
    
    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10, 10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(-10, 0));
        
        b1.draw();
        b2.draw();
        
        bitmapPool.release(b1);
        bitmapPool.release(b2); 
    }
    
}
