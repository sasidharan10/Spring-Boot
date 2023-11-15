package com.project1.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
	Dependency1 d1;
	
	Dependency2 d2;
	
	// @Autowired   // optional
	public YourBusinessClass(Dependency1 d1, Dependency2 d2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.d1 = d1;
		this.d2 = d2;
	}

	/*
	@Autowired
	public void setD1(Dependency1 d1) {
		System.out.println("Setter Injection - setDependency1");
		this.d1 = d1;
	}

	@Autowired
	public void setD2(Dependency2 d2) {
		System.out.println("Setter Injection - setDependency2");
		this.d2 = d2;
	}
	*/

	public String toString()
	{
		return "Using " + d1 + " and " + d2;
	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DepInjenctionLauncherApplication {
	public static void main(String[] args) {
		try(
		var context = new AnnotationConfigApplicationContext(DepInjenctionLauncherApplication.class);)
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class).toString());
		}
	}

}
