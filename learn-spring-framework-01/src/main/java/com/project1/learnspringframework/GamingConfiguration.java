package com.project1.learnspringframework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project1.learnspringframework.game.gameConsole;
import com.project1.learnspringframework.game.gameRunner;
import com.project1.learnspringframework.game.pacman;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public gameConsole game()
	{
		var game = new pacman();
		return game;
	}
	
	@Bean
	public gameRunner gameRun(gameConsole game)
	{
		var gameRunning = new gameRunner(game);
		return gameRunning;
	}

	//gameRunner.run();
}
