package com.lti.testcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.junit.Calculater;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculater c=new Calculater();
		int actualResult = c.add(10,20);
		//System.out.println(result);
		// no no no : no sysout when writing test cases
		int expectedResult = 30;
	     assertEquals(expectedResult,actualResult);
	
	}
	@Test
	public void testsub() {
		Calculater c=new Calculater();
		int actualResult = c.sub(10,20);
		//System.out.println(result);
		// no no no : no sysout when writing test cases
		int expectedResult = -10;
	     assertEquals(expectedResult,actualResult);
	
	}
}
