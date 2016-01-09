package com.codepandablog.core.test.junit;

import junit.framework.TestCase;

public class JavaTest extends TestCase {

	protected int a,b;
	@Override
	protected void setUp() throws Exception {
		a=10;
		b=20;
	}

	public void testAdd(){
		int result=a+b;
		assertTrue(result==30);
	}
}
