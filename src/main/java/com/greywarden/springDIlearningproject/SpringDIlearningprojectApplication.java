package com.greywarden.springDIlearningproject;

import com.greywarden.springDIlearningproject.controllers.ConstructorInjectedController;
import com.greywarden.springDIlearningproject.controllers.MyController;
import com.greywarden.springDIlearningproject.controllers.PropertyInjectedController;
import com.greywarden.springDIlearningproject.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDIlearningprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDIlearningprojectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String salve = myController.sayHello();
		System.out.println(salve);

		System.out.println("--------------> Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean(
				"propertyInjectedController"
		);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------> Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(
				"setterInjectedController"
		);

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------> Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(
				"constructorInjectedController"
		);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
