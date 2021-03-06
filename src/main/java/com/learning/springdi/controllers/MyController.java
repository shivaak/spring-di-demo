/**
 * 
 */
package com.learning.springdi.controllers;


import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import com.learning.springdi.services.GreetingService;

/**
 * @author shivaak on 24-Dec-2018
 *
 */
@Controller
public class MyController implements BeanNameAware, ApplicationContextAware , InitializingBean, DisposableBean{

	private GreetingService greetingService;

	@Autowired
	public MyController(GreetingService gs) {
		super();
		this.greetingService = gs;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(applicationContext.getBeanDefinitionNames());
	}

	@PostConstruct
	public void init() {
		System.out.println("Init Method");
	}


	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}


	public String sayHello() {
		return greetingService.sayGreeting();
	}



}
