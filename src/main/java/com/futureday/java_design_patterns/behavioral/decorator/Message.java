package com.futureday.java_design_patterns.behavioral.decorator;

/**
 *
 * This interface will be implemented by each decorated class, as well by the
 * Original class. It's mandatory to be implemented by both.
 * 
 * @author Filipe
 */
public interface Message {
    
    String getContent();
    
}
