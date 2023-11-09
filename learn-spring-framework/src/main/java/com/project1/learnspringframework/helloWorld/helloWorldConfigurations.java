package com.project1.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class helloWorldConfigurations {

	@Bean
	public String name()
	{
		return "Sasi";
	}
	
	@Bean
	public int age()
	{
		return 10;
	}
	
	@Bean
	public Person person()
	{
		return new Person("Rohit", 45, new Address("Chennai", "Tidal park"));
	}
	
	// new bean defined by existing methods
	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(), age(), address());
	}
	
	//using bean to define new bean
	@Bean
	public Person person3Parameter(String nm, int ag, Address ad)
	{
		return new Person(nm, ag, ad);
	}
	
	/*
	 * if there are multiple beans of same type,
 	then we can specify which bean to use, using qualifiers
 	*/
	@Bean
	public Person person4Parameter(String name, int age, @Qualifier("address3Qualifier") Address address)
	{
		return new Person(name, age, address);
	}
	
	// we can change bean name here
	@Bean(name="address2")
	@Primary
	public Address address()
	{
		return new Address("3/140", "Coimbatore");
	}
	
	@Bean()
	@Qualifier("address3Qualifier")
	public Address address3()
	{
		return new Address("4/714", "Mumbai");
	}
	
	
	
}
