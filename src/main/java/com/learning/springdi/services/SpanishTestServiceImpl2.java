/**
 * 
 */
package com.learning.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Service("ts2")
@Profile("es")
public class SpanishTestServiceImpl2 implements TestService {
	
	public static final String msg = "Spanish Msg Test Service Impl 2";

	@Override
	public String sayHelloFromInterface() {
		return msg;
	}


}
