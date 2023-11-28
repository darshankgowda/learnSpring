package com.atdkg.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("go up");
	}
	public void down() {
		System.out.println("go down");
	}
	public void right() {
		System.out.println("accelerate");
	}
	public void left() {
		System.out.println("go back");
	}

}
