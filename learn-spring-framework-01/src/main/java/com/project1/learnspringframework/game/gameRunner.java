package com.project1.learnspringframework.game;

public class gameRunner {
	// marioGame mg;
	private gameConsole gc;
	public gameRunner(gameConsole gc)
	{
		this.gc = gc;
	}
	public void run()
	{
		System.out.println("Game Running...");
		gc.up();
		gc.down();
		gc.left();
		gc.right();
	}
}
