package com.futureday.java_design_patterns.behavioral.facade;

import com.futureday.java_design_patterns.behavioral.facade.email.EmailFacade;

/**
 * Only uses the EmailFacade class, which keeps all the procedures to 
 * send the e-mail, hiding all the functionalities of the sub-system from 
 * the client.
 * @author FilipeSoares-STI
 */

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
                
                boolean result = facade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
		
	}
	
}
