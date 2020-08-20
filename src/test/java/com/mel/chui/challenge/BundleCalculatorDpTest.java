package com.mel.chui.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BundleCalculatorDpTest {

	@Test
	void calculate13() {
		int[] bundles = {3, 5, 9};
		BundleCalculatorDP calculator = new BundleCalculatorDP();

		FilledBundles result = calculator.calculate(bundles, 13);

		assertEquals(0, result.getBundleAmount(9));
		assertEquals(1, result.getBundleAmount(3));
		assertEquals(2, result.getBundleAmount(5));
	}

	@Test
	void calculate23() {
		int[] bundles = {3, 5, 9};
		BundleCalculatorDP calculator = new BundleCalculatorDP();

		FilledBundles result = calculator.calculate(bundles, 23);

		assertEquals(2, result.getBundleAmount(9));
		assertEquals(0, result.getBundleAmount(3));
		assertEquals(1, result.getBundleAmount(5));
	}

	@Test
	void calculate100() {
		int[] bundles = {3, 5, 9};
		BundleCalculatorDP calculator = new BundleCalculatorDP();

		FilledBundles result = calculator.calculate(bundles, 100);

		assertEquals(10, result.getBundleAmount(9));
		assertEquals(0, result.getBundleAmount(3));
		assertEquals(2, result.getBundleAmount(5));
	}

	@Test
	void calculate100_1() {
		int[] bundles = {3, 6, 9};
		BundleCalculatorDP calculator = new BundleCalculatorDP();

		FilledBundles result = calculator.calculate(bundles, 100);

		assertEquals(11, result.getBundleAmount(9));
		assertEquals(1, result.getBundleAmount(3));
		assertEquals(0, result.getBundleAmount(6));
	}
}
