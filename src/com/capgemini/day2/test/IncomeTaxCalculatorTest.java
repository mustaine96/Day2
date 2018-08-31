package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTaxCalculator;

class IncomeTaxCalculatorTest {

	@Test
	void testTaxCalculator() {
		assertEquals(0,IncomeTaxCalculator.taxCalculator(0));
		assertEquals(0,IncomeTaxCalculator.taxCalculator(180000));
		assertEquals(0,IncomeTaxCalculator.taxCalculator(175000));
		//assertEquals(18100.1,IncomeTaxCalculator.taxCalculator(181001));
		assertEquals(30000.0,IncomeTaxCalculator.taxCalculator(300000));
		assertEquals(19000.0,IncomeTaxCalculator.taxCalculator(190000));
		assertEquals(18100.1,IncomeTaxCalculator.taxCalculator(181001));
		assertEquals(60000.2,IncomeTaxCalculator.taxCalculator(300001));
		assertEquals(100000,IncomeTaxCalculator.taxCalculator(500000));
		assertEquals(80000,IncomeTaxCalculator.taxCalculator(400000));
		assertEquals(150000.3,IncomeTaxCalculator.taxCalculator(500001));
		assertEquals(300000,IncomeTaxCalculator.taxCalculator(1000000));
		assertEquals(210000,IncomeTaxCalculator.taxCalculator(700000));
		
		
	}

}
