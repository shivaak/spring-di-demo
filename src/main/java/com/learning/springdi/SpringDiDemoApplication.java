package com.learning.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learning.outerworld.OuterWorldService;
import com.learning.springdi.controllers.ConstructorInjectedController;
import com.learning.springdi.controllers.MyController;
import com.learning.springdi.controllers.PropertyInjectedController;
import com.learning.springdi.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.learning.outerworld", "com.learning.springdi"})
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
		
		MyController obj = (MyController) ctx.getBean("myController");
		System.out.println(obj.sayHello());
		
		PropertyInjectedController pic = (PropertyInjectedController)ctx.getBean(PropertyInjectedController.class);
		System.out.println(pic.sayHello());
		
		ConstructorInjectedController cic = (ConstructorInjectedController)ctx.getBean(ConstructorInjectedController.class);
		System.out.println(cic.sayHello());
		
		SetterInjectedController sic = (SetterInjectedController)ctx.getBean(SetterInjectedController.class);
		System.out.println(sic.sayHello());
		
		
		OuterWorldService ows = ctx.getBean(OuterWorldService.class);
		System.out.println(ows.getMessage());
	}

}

