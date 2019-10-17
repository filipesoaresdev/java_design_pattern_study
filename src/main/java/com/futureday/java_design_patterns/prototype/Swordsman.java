/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.futureday.java_design_patterns.prototype;

/**
 *
 * @author FilipeSoares-STI
 */
public class Swordsman extends GameUnit{
    
    private String state = "idle";
    
    public void attack(){
        this.state = "attack";
    }

    @Override
    public String toString() {
        return "Swordsman "+state+" @ "+ getPosition();
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }
    
    
    
}
