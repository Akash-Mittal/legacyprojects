package com.junit.example.one;

import junit.framework.TestCase;
import junit.framework.TestFailure;

public class CalcTest extends TestCase {
private int one;
private int two;

	
	
	public CalcTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		
		super.setUp();
		one = 3;
		two = 5;
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		
		one = 0;
		two = 0;
	}

	public void testAdd() {
		assertEquals(Calc.add(one, two), 8);
		//fail("Not yet implemented");
	}
	
	
	public void testFailedAdd(){
		assertNotSame(12,Calc.add(one, two) );
	}
	
	public void testSub() {
		assertEquals(Calc.sub(one, two), -2);
	
	}

}
