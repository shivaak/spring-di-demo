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
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
