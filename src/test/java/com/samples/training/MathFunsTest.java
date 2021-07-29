package com.samples.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathFunsTest {
	
	@Test
	public void testSqrtOfMinusOne() {
		double number = -1.0;
		double result = Double.NaN;

		assertEquals(result, MathFuns.sqrt(number), 100.0);
	}

	@Test
	public void testSqrtOf25() {
		double number = 25.0;
		double result = 5.0;

		assertEquals(result, MathFuns.sqrt(number), 100.0);
	}

	@Test
	public void testSquare() {
		double number = 5.0;
		double result = 25.0;

		assertEquals(result, MathFuns.square(number), 100.0);
	}

	@Test
	public void testCube() {
		double number = 5.0;
		double result = 125.0;

		assertEquals(result, MathFuns.cube(number), 100.0);
	}

	@Test
	public void testPower() {
		double number = 5.0;
		double power = 4.0;
		double result = 625.0;

		assertEquals(result, MathFuns.power(number, power), 100.0);
	}
}
