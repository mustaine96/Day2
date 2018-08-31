package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void testfindAllArmstrong() {
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, ArmstrongRange.findAllArmstrongNumbers1(100, 1000));

	}

}
