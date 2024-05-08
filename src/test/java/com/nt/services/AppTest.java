package com.nt.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void testWithPositive() {
		int a = 10;
		int b = 20;
		int expected = 30;
		App app1 = new App();
		int actual = app1.sum(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void testWithPositiveNegative() {
		int a = -10;
		int b = -20;
		int expected = -10;
		App app1 = new App();
		int actual = app1.sum(a, b);
		assertEquals(expected, actual);
	}

	public void testWithPositiveMixedValues() {
		int a = 10;
		int b = -20;
		int expected = -10;
		App app1 = new App();
		int actual = app1.sum(a, b);
		assertEquals(expected, actual);
	}
}
