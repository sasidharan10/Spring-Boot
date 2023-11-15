package com.project1.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class superContra implements gameConsole{
	public void up() {
		System.out.println("Go Up");
	}
	public void down() {
		System.out.println("Sit Down");

	}
	public void left() {
		System.out.println("Move Left");
	}
	public void right() {
		System.out.println("Shoot a Bullet");
	}
}
