package com.futureday.java_design_patterns.behavioral.facade.email;

/**
 * 
 * @author FilipeSoares-STI
 */
public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
