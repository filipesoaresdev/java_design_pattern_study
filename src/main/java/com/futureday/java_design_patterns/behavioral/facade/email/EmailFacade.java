package com.futureday.java_design_patterns.behavioral.facade.email;

import com.futureday.java_design_patterns.behavioral.facade.Order;

/**
 *
 * @author FilipeSoares-STI
 */
//Facade provides simple methods for client to use
public class EmailFacade {

    public boolean sendOrderEmail(Order order) {
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}
