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
public class SetterInjectedController {
	
	private TestService ts;
	
	public String sayHello() {
		return ts.sayHelloFromInterface();
	}

	@Autowired
	@Qualifier("ts2")
	public void setTs(TestService ts) {
		this.ts = ts;
	}

	
}
