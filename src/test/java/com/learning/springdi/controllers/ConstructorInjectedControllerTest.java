/**
 * 
 */
package com.learning.springdi.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.learning.springdi.services.GreetingServiceImpl;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
public class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController cic; 
	
	@Before
	public void setup() {
		this.cic = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testSayHello() {
		assertEquals(GreetingServiceImpl.msg, cic.sayHello());
	}

}
