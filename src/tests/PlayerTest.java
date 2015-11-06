package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Player;

/**
 * Date: 03/11/2015
 *
 * Project: CDIO2
 *
 * File: PlayerTest.java
 *
 * Created by: Morten Jørvad
 */

public class PlayerTest {

	@Test
	public void testAdjustPoints() {
		Player player = new Player();
		player.setBalance(1000);
		player.adjustPoints(50);
		assertEquals(player.getBalance(), 1050);
	}

	@Test
	public void testSetBalance() {
		Player player = new Player();
		player.setBalance(50000);
		assertEquals(player.getBalance(), 50000);
	}

	@Test
	public void testSetName() {
		Player player = new Player();
		player.setName("Hej, det her er en test");
		assertEquals("Hej, det her er en test", player.getName());
	}
	
	@Test
	public void testNegativeSetBalance() {
		Player player = new Player();
		player.setBalance(-2000);
		assertEquals(player.getBalance(), 0);
	}
	
	

}
