package tests;

import static org.junit.Assert.*;
import logic.Game;

import org.junit.Test;

/**
 * Date: 03/11/2015
 *
 * Project: CDIO2
 *
 * File: GameTest.java
 *
 * Created by: Morten J�rvad
 */

public class GameTest {

	@Test
	public void testCheckWinningConditions() {
		Game game = new Game(2, 6);
		assertEquals(game.checkWinningConditions(), "");
	}

	@Test
	public void testSwappingTurnsCorrectly() {
		Game game = new Game(2, 6);
		//turn is 1 here
		int turn = game.getTurn();
		game.rollPlayer(game.getPlayer(0));
		int turnTwo = game.getTurn();
		//sl�r man 10 == Werewall, f�r man ekstra tur, dvs turen ikke skifter.
		if(game.getCup().getDiceSum() != 10){
			assertTrue(turn != turnTwo);
		}
		else{
			assertTrue(turn == turnTwo);
		}
		
		
	}
}
