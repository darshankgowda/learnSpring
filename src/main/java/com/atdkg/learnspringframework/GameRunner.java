package com.atdkg.learnspringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;  //how is it possible
	//means the implemented methods are the part of GamingConsole
	//constructor injection
	@Autowired   //not mandatory
	public GameRunner(@Qualifier("SuperContraGame Qualifier") GamingConsole  game) {  //forcing method to give preferences to @Qualifier for autowiring
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " +game);
		game.up();
		game.down();
		game.left();
		game.right();	
	}
}
