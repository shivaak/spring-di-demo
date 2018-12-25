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
@Profile("es")
public class PrimarySpanishTestServiceImpl implements TestService{

	public static final String msg = "This is a spanish msg";
	
	@Override
	public String sayHelloFromInterface() {
		return msg;
	}

}
