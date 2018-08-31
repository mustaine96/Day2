package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class ArmstrongTest {

	@Test
	void testCheckIfArmstrong() {
		assertEquals(true,Armstrong.checkIfArmstrong(153));
		assertEquals(false,Armstrong.checkIfArmstrong(152));
		assertEquals(false,Armstrong.checkIfArmstrong(0153));
		assertEquals(false,Armstrong.checkIfArmstrong(0x153));
		assertEquals(false,Armstrong.checkIfArmstrong('c'));
		
		
		
	}

}
