/**
 * 
 */
package com.learning.springdi.controllers;

import org.junit.Before;
import org.junit.Test;

import com.learning.springdi.services.TestServiceImpl;
import com.learning.springdi.services.TestServiceImpl2;

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
		this.sic.setTs(new TestServiceImpl2());
	}
	
	@Test
	public void testSayHello() {
		assertEquals(TestServiceImpl2.msg,this.sic.sayHello());
	}

}
