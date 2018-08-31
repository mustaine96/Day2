package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Squared;

class SquaredTest {

	@Test
	void testSquare() {
		assertEquals(25,Squared.findSquare(5));
		assertEquals(25,Squared.findSquare(-5));
		assertEquals(30.25,Squared.findSquare(5.5));
		assertEquals(30.25,Squared.findSquare(-5.5));
		
		
	
	}

}
