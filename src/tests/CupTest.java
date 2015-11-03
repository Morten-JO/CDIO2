package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Cup;

/**
 * Date: 03/11/2015
 *
 * Project: CDIO2
 *
 * File: CupTest.java
 *
 * Created by: Morten Jørvad
 */

public class CupTest {

	@Test
	public void testRollDices() {
		Cup cup = new Cup(2, 6);
		int now = cup.getDiceSum();
		cup.rollDices();
		//Dette kan gøres da den første sum er 0
		assertTrue(cup.getDiceSum() != now);
	}

	@Test
	public void testGetDiceSum() {
		Cup cup = new Cup(2, 6);
		//Summen er 0 uden at der er blevet kastet
		assertEquals(0, cup.getDiceSum());
	}

	@Test
	public void testGetLastDiceSum() {
		Cup cup = new Cup(2, 6);
		cup.rollDices();
		int last = cup.getDiceSum();
		cup.rollDices();
		assertEquals(last, cup.getLastDiceSum());
	}

	@Test
	public void testGetSumOfDice() {
		Cup cup = new Cup(2, 6);
		cup.rollDices();
		assertTrue(cup.getSumOfDice(0) != 0);
	}

	@Test
	public void testGetLastSumOfDice() {
		Cup cup = new Cup(2, 6);
		cup.rollDices();
		int lastDice = cup.getSumOfDice(0);
		cup.rollDices();
		assertEquals(cup.getLastSumOfDice(0), lastDice);
	}

}
