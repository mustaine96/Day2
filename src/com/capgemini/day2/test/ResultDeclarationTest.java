package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ResultDeclaration;

class ResultDeclarationTest {

	@Test
	void testdeclareResult() {
		assertEquals("Passed",ResultDeclaration.declareResult(61,62,63));
		assertEquals("Promoted",ResultDeclaration.declareResult(61,60,61));
		assertEquals("Promoted",ResultDeclaration.declareResult(60,61,61));
		assertEquals("Promoted",ResultDeclaration.declareResult(61,61,60));
		assertEquals("Failed",ResultDeclaration.declareResult(60,58,59));
		assertEquals("Failed",ResultDeclaration.declareResult(60,59,61));
		assertEquals("Failed",ResultDeclaration.declareResult(60,61,59));
		assertEquals("Failed",ResultDeclaration.declareResult(61,60,59));
		
	}

}
