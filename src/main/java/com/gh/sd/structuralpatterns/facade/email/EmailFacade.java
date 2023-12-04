package com.gh.sd.structuralpatterns.facade.email;

import com.gh.sd.structuralpatterns.facade.Order;
import com.gh.sd.structuralpatterns.facade.email.Template.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {
	
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.EMAIL);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
					  .withTemplate(template)
					  .withStationary(stationary)
					  .forObject(order)
					  .build();
		Mailer mailer = Mailer.getInstance();
		return mailer.send(email);
	}
}
