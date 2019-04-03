package com.calulator.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator cal = new Calculator();
	
	int a = 5;
	int b = 6;

	@Test
	void testAdd() {
		
		assertEquals(5, cal.add(2, 3));
		//fail("Not yet implemented");
	}

	@Test
	void testSubtract() {
	assertEquals(6, cal.subtract(9, 3));
	}

}
