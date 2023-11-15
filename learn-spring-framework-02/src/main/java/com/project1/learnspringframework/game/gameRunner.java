package com.project1.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gameRunner {
	// marioGame mg;
	private gameConsole gc;
	public gameRunner(@Qualifier("superContraQualifier")gameConsole gc)
	{
		this.gc = gc;
	}
	public void run()
	{
		System.out.println("Game Running..." + gc);
		gc.up();
		gc.down();
		gc.left();
		gc.right();
	}
}
