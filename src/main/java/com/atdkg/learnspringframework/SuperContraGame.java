package com.atdkg.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame Qualifier")
public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("sit down");
	}
	public void right() {
		System.out.println("shoot a bullet");
	}
	public void left() {
		System.out.println("go back");
	}

}
