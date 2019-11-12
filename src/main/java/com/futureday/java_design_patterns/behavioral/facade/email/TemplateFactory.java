package com.futureday.java_design_patterns.behavioral.facade.email;
/**
 * 
 * @author FilipeSoares-STI
 */
public class TemplateFactory {

	public static Template createTemplateFor(Template.TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
