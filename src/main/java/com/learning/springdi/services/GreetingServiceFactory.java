/**
 * 
 */
package com.learning.springdi.services;

import com.learning.springdi.repository.GreetingRepository;

/**
 * @author shivaak on 29-Dec-2018
 *
 */
public class GreetingServiceFactory {

	GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {
		switch(lang) {
		case "en":
			return new EnglishGreetingServiceImpl(greetingRepository);
		case "de":
			return new GermanGreetingServiceImpl(greetingRepository);
		case "es":
			return new SpanishGreetingServiceImpl(greetingRepository);
		default :
			return new GreetingServiceImpl();
		}
	}



}
