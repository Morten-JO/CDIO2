package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Account;

/**
 * Date: 03/11/2015
 *
 * Project: CDIO2
 *
 * File: AccountTest.java
 *
 * Created by: Morten Jørvad
 */

public class AccountTest {

	@Test
	public void testSetBalance() {
		Account acc = new Account(1000);
		acc.setBalance(0);
		assertEquals(acc.getBalance(), 0);
	}
	
	@Test
	public void testNegative(){
		Account acc = new Account(1000);
		acc.adjustBalance(-20000);
		assertEquals(acc.getBalance(), 0);
	}

	@Test
	public void testAdjustBalance() {
		Account acc = new Account(1000);
		acc.adjustBalance(1000);
		assertEquals(acc.getBalance(), 2000);
	}

	@Test
	public void testGetBalance() {
		Account acc = new Account(1000);
		assertEquals(acc.getBalance(), 1000);
	}

}
