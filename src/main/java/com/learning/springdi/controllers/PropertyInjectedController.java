/**
 * 
 */
package com.learning.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.learning.springdi.services.TestService;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("ts1")
	public TestService ts1;
	
	public String sayHello() {
		return ts1.sayHelloFromInterface();
	}

}
