package com.futureday.java_design_patterns.behavioral.facade.email;

/**
 * 
 * @author FilipeSoares-STI
 */
public class Email {

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
