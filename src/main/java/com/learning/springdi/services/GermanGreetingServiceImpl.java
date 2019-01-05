/**
 * 
 */
package com.learning.springdi.services;

import com.learning.springdi.repository.GreetingRepository;

/**
 * @author shivaak on 24-Dec-2018
 *
 */

public class GermanGreetingServiceImpl implements GreetingService {
	
	private GreetingRepository greetingRepository;

	public GermanGreetingServiceImpl(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return this.greetingRepository.getGermanGreeting();
	}


}
