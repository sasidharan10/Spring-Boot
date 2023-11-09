package com.project1.learnspringframework.helloWorld;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app02HelloWorld {

	public static void main(String[] args) {
		// launching a spring context
		
		// try() try with resourses
		try(
		var context = 
		new AnnotationConfigApplicationContext(helloWorldConfigurations.class)){
		/*
		-  configure the thing spring want to manage, like here
		   its "helloWorldConfigurations" @configuration
		 */
		// Retrieving the beans managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameter"));
		System.out.println(context.getBean("person4Parameter"));
		System.out.println(context.getBean(Address.class));
		
		// Print all beans names
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		
	}

}
