package com.futureday.java_design_patterns.behavioral.facade.email;

/**
 * 
 * @author FilipeSoares-STI
 */
public class HalloweenStationary implements Stationary {

	@Override
	public String getHeader() {
		return "It's Halloween!!";
	}

	@Override
	public String getFooter() {
		return "BUY MORE STUFF! It's Halloween, c'mon!!";
	}

}
