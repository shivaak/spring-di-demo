/**
 * 
 */
package com.learning.springdi.repository;

import org.springframework.stereotype.Repository;

/**
 * @author shivaak on 28-Dec-2018
 *
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de Saludo Primario";
	}

	@Override
	public String getGermanGreeting() {

		return "Primärer Grußdienst";

	}

}
