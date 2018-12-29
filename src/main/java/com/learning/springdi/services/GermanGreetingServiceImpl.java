/**
 * 
 */
package com.learning.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.learning.springdi.repository.GreetingRepository;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Service
@Primary
@Profile("de")
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
