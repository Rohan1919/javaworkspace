package com.lti;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testIFAddIsWorking() {
		Calculator c=new Calculator ();
		int result=c.add(10,20);
		int expected=30;
		assertEquals(expected,result);// check it is equal or not
		
		
		
	}

}
