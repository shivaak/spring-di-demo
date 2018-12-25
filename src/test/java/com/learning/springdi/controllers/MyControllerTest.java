/**
 * 
 */
package com.learning.springdi.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.learning.springdi.services.PrimaryTestServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author shivaak on 25-Dec-2018
 *
 */
public class MyControllerTest {

	private MyController mc;
	
	@Before
	public void setup() {
		mc = new MyController(new PrimaryTestServiceImpl());
		
	}
	
	@Test
	public void test() {
		assertEquals(PrimaryTestServiceImpl.msg, mc.sayHello());
	}

}
