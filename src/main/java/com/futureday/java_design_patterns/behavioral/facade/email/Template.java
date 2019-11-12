package com.futureday.java_design_patterns.behavioral.facade.email;

/**
 * 
 * @author FilipeSoares-STI
 */
public abstract class Template {

	public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
	
}
