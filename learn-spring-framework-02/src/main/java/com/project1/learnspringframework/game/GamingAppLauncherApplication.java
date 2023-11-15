package com.project1.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.project1.learnspringframework.game")
public class GamingAppLauncherApplication {
	public static void main(String[] args) {
		try(
		var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);)
		{
			context.getBean(gameConsole.class).up();
			context.getBean(gameRunner.class).run();
		}
	}

}
