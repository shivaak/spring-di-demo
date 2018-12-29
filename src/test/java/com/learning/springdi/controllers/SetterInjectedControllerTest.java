/**
 * 
 */
package com.learning.springdi.controllers;

import org.junit.Before;
import org.junit.Test;

import com.learning.springdi.services.GreetingServiceImpl;
import com.learning.springdi.services.SetterGreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
public class SetterInjectedControllerTest {
	
	private SetterInjectedController sic; 
	
	@Before
	public void setup() {
		this.sic = new SetterInjectedController();
		this.sic.setGreetingService(new SetterGreetingServiceImpl());
	}
	
	@Test
	public void testSayHello() {
		assertEquals(SetterGreetingServiceImpl.msg,this.sic.sayHello());
	}

}
