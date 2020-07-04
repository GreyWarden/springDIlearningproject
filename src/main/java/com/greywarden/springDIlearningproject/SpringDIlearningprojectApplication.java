package com.greywarden.springDIlearningproject;

import com.greywarden.springDIlearningproject.controllers.*;
import com.greywarden.springDIlearningproject.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDIlearningprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDIlearningprojectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("--------------> Primary");
		System.out.println(myController.sayHello());

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

		System.out.println("----------> i18n");
		I18nController i18nController = (I18nController) ctx.getBean(
				"i18nController"
		);
		System.out.println(i18nController.saySalve());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
	}

}
