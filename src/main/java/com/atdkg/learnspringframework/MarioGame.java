package com.atdkg.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //giving higher preferences to MarioGame than PacMan
public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("jump");
	}
	public void down() {
		System.out.println("go into hole");
	}
	public void right() {
		System.out.println("accelerate");
	}
	public void left() {
		System.out.println("go back");
	}

}
