package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.DateFormat;

class DateFormatTest {

	@Test
	void testChangeDate() {
		assertEquals("09/July/2010",DateFormat.alterDate("09,07,2010"));
		assertEquals("09/August/2010",DateFormat.alterDate("09,08,2010"));
		assertEquals("09/September/2010",DateFormat.alterDate("09,09,2010"));
		assertEquals("09/October/2010",DateFormat.alterDate("09,10,2010"));
		assertEquals("09/November/2010",DateFormat.alterDate("09,11,2010"));
		assertEquals("09/December/2010",DateFormat.alterDate("09,12,2010"));
		assertEquals("09/June/2010",DateFormat.alterDate("09,06,2010"));
		assertEquals("09/May/2010",DateFormat.alterDate("09,05,2010"));
		assertEquals("09/April/2010",DateFormat.alterDate("09,04,2010"));
		assertEquals("09/March/2010",DateFormat.alterDate("09,03,2010"));
		assertEquals("09/February/2010",DateFormat.alterDate("09,02,2010"));
		assertEquals("09/January/2010",DateFormat.alterDate("09,01,2010"));
	}

}
