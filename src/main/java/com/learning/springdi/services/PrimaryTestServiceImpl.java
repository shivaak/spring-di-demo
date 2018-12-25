/**
 * 
 */
package com.learning.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author shivaak on 25-Dec-2018
 *
 */
@Service
@Primary
@Profile({"en","default"})
public class PrimaryTestServiceImpl implements TestService{

	public static final String msg = "Message from Primary Service";
	TestService pts;
	
	@Override
	public String sayHelloFromInterface() {
		return msg;
	}

}
