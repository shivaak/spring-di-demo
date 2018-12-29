/**
 * 
 */
package com.learning.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.learning.springdi.services.GreetingService;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
//@Controller -- Commented this to ignore this component this component is same for @Qualifier
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("setterGreetingServiceImpl")
	public void setGreetingService(GreetingService ts) {
		this.greetingService = ts;
	}

	
}
