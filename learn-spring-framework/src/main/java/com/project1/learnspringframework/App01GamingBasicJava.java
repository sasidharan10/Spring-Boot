package com.project1.learnspringframework;

import com.project1.learnspringframework.game.gameRunner;
import com.project1.learnspringframework.game.marioGame;
import com.project1.learnspringframework.game.superContra;
import com.project1.learnspringframework.game.pacman;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var game = new pacman();
		// var game = new marioGame();
		// var game = new superContra();
		var gameRunner = new gameRunner(game);
		gameRunner.run();

	}

}
