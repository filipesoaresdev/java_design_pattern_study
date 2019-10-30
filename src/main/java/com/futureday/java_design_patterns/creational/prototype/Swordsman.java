package com.futureday.java_design_patterns.creational.prototype;

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
