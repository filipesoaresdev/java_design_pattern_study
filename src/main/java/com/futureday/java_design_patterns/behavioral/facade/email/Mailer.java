package com.futureday.java_design_patterns.behavioral.facade.email;

/**
 * 
 * @author FilipeSoares-STI
 */
public class Mailer {

	private static final Mailer MAILER = new Mailer();
	
	public static Mailer getMailer() {
		return MAILER;
	}
	
	private Mailer() {
		
	}
	
	public boolean send(Email email) {
		return true;
	}; 
	
}
