package com.project1.learnspringframework.game;

public class marioGame implements gameConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Go down");

	}
	public void left() {
		System.out.println("Move back");
	}
	public void right() {
		System.out.println("Move Forward");
	}
}
