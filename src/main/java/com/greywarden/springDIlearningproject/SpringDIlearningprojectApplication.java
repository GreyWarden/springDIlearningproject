package com.greywarden.springDIlearningproject;

import com.greywarden.springDIlearningproject.controllers.MyController;
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
	}

}
