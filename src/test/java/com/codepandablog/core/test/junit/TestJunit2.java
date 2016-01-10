package com.codepandablog.core.test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJunit2 extends TestCase {

	protected double fValue1;
	protected double fValue2;
	
	@Before
	protected void setUp() throws Exception {
		fValue1=2.0;
		fValue2=3.0;
	}
	
	@Test
	public void testAdd(){
		System.out.println("No of test Cases:"+this.countTestCases());
		System.out.println("Test case name:"+this.getName());
		this.setName("my Add test case");
		System.out.println("New Test case Name:"+this.getName());
	}
	
	@After
	public void tearDown(){
		System.out.println("cleaning obj.");
	}

	
}
