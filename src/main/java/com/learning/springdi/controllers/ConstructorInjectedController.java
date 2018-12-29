/**
 * 
 */
package com.learning.springdi.controllers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Controller;

import com.learning.springdi.services.GreetingService;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Controller
public class ConstructorInjectedController implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	private GreetingService greetingService;
	
	public ConstructorInjectedController() {
		super();
	}
	@Autowired(required=true)
	public ConstructorInjectedController(GreetingService ts) {
		this.greetingService= ts;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
