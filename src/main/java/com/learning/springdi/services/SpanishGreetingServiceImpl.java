/**
 * 
 */
package com.learning.springdi.services;

import com.learning.springdi.repository.GreetingRepository;

/**
 * @author shivaak on 25-Dec-2018
 *
 */
public class SpanishGreetingServiceImpl implements GreetingService{

	private GreetingRepository greetingRepository;

	public SpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return this.greetingRepository.getSpanishGreeting();
	}

}
