package com.project1.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.project1.learnspringframework.game.gameRunner;
import com.project1.learnspringframework.game.gameConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);)
		{
			context.getBean(gameConsole.class).up();
			context.getBean(gameRunner.class).run();
		}
	}

}
