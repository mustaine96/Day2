package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.InterestCalculator;

class Interest {

	@Test
	void testcalculateCompoundInterest() {
		
		assertEquals(55255.62,InterestCalculator.compundInterest(5000,1,10));
		assertEquals(55255.62,InterestCalculator.compundInterest(5000,1,0));
		assertEquals(55255.62,InterestCalculator.compundInterest(5526.23,1,10));
		assertEquals(55255.62,InterestCalculator.compundInterest(5000,0,10));

	}
	
	@Test
	void testcalculateSimpleInterest() {
		
	}
	

}
