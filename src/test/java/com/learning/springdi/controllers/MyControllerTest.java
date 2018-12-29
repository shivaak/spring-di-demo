/**
 * 
 */
package com.learning.springdi.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.learning.springdi.services.EnglishGreetingServiceImpl;
import com.learning.springdi.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author shivaak on 25-Dec-2018
 *
 */
public class MyControllerTest {

	private MyController mc;
	
	@Before
	public void setup() {
		mc = new MyController(new GreetingServiceImpl());
		
	}
	
	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.msg, mc.sayHello());
	}

}
