/**
 * 
 */
package com.learning.springdi.services;

import org.springframework.stereotype.Service;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
//@Service("setterGreetingServiceImpl") - -- Commented this to ignore this component this component is same for @Qualifier
public class SetterGreetingServiceImpl implements GreetingService {
	
	public static final String msg = "Hello !! I was injected by setter !";

	@Override
	public String sayGreeting() {
		return msg;
	}


}
