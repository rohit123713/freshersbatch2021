package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(QuickStartApplication.class, args);
		
		System.out.println(ctx.getBean("ram"));
		System.out.println(ctx.getBean("shyam"));
		
		System.out.println(ctx.getBean("hospital"));
		System.out.println(ctx);
	}

}
