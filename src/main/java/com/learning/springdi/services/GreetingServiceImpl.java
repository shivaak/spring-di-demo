/**
 * 
 */
package com.learning.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Service
@Primary
@Profile("dev")
public class GreetingServiceImpl implements GreetingService {

	public static final String msg = "Hello directly from Greeting Service used for dev profile";
	
	@Override
	public String sayGreeting() {
		return msg;
	}


}
