/**
 * 
 */
package com.learning.springdi.controllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.learning.springdi.services.TestServiceImpl;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController pic; 
	
	@Before
	public void setup() {
		this.pic = new PropertyInjectedController();
		this.pic.ts1 = new TestServiceImpl();
	}
	
	@Test
	public void testSayHello() {
		assertEquals(TestServiceImpl.msg,this.pic.sayHello());
	}

}
