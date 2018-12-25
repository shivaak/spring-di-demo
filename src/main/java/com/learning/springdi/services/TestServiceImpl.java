/**
 * 
 */
package com.learning.springdi.services;

import org.springframework.stereotype.Service;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Service("ts1")
public class TestServiceImpl implements TestService {

	public static final String msg = "Hello From Test Service Impl 1";
	
	@Override
	public String sayHelloFromInterface() {
		return msg;
	}


}
