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
public class General extends GameUnit{
    
    private String state = "idle";
    
    public void boostMorale(){
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General "+state+" @ "+ getPosition();
    }

    //We implement clone() because in General clone is not supported.
    //So, we use the CloneNotSupportedException
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General are unique");
    }

    //Reset is not supported because clone is also not supported.
    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Unsupported");
    }
    
    
    
}
