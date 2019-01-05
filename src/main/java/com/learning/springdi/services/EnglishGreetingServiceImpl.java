/**
 * 
 */
package com.learning.springdi.services;

import com.learning.springdi.repository.GreetingRepository;

/**
 * @author shivaak on 25-Dec-2018
 *
 */
public class EnglishGreetingServiceImpl implements GreetingService{

	private GreetingRepository greetingRepository;
	
	public EnglishGreetingServiceImpl(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return this.greetingRepository.getEnglishGreeting();
	}

}
