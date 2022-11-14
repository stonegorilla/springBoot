package com.ssafy.HelloSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloSpringBootApplication.class, args);
	
		String[] names = context.getBeanDefinitionNames();
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
