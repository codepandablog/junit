package com.codepandablog.core.test.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit1 {

	@Test
	public void testAdd(){
		
		int num=5;
		String temp=null;
		String str="Junit is working Fine";
		
		assertEquals("Junit is working Fine",str);
		assertFalse(num>6);
		assertNotNull(str);
	}
}
