package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Field;
import entities.Player;

/**
 * Date: 03/11/2015
 *
 * Project: CDIO2
 *
 * File: FieldTest.java
 *
 * Created by: Morten Jørvad
 */

public class FieldTest {

	@Test
	public void testGetPoints() {
		Field field = new Field("test", 20);
		assertEquals(field.getPoints(), 20);
	}

	@Test
	public void testGetName() {
		Field field = new Field("test", 20);
		assertEquals(field.getName(), "test");
	}

	@Test
	public void testLandOn() {
		Player player = new Player();
		player.setName("test");
		player.setBalance(1000);
		Field field = new Field("test", 20);
		field.landOn(player);
		assertEquals(player.getBalance(), 1020);
	}

}
