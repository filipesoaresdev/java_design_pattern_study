package com.futureday.java_design_patterns.behavioral.decorator;

/**
 * Client that tests the decorator classes
 * 
 * @author Filipe
 */
public class Client {
    
    public static void main(String[] args) {
        
        Message m = new TextMessage("That's a <b>bold</b> in HTML");
        System.out.println(m.getContent());
        
        Message mDecoratedHtml = new HtmlEncondedMessage(m);
        System.out.println(mDecoratedHtml.getContent());
        
        Message mDecorated64 = new Base64EncodedMessage(m);
        System.out.println(mDecorated64.getContent());
        
    }
    
}
