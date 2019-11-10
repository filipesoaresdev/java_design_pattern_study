package com.futureday.java_design_patterns.behavioral.decorator;

import org.apache.commons.text.StringEscapeUtils;


/**
 *
 * This class slightly changes the message. 
 * The change must not modify too much the content
 * 
 * @author Filipe
 */
public class HtmlEncondedMessage implements Message{

    private Message msg;

    public HtmlEncondedMessage(Message msg) {
        this.msg = msg;
    }
    
    @Override
    public String getContent() {
        
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
    
}
