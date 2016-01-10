package com.codepandablog.core.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyAssertTest {

	String str1=new String("Hem");
	String str2=new String("Hem");
	String str3=null;
	String str4="Hem";
	String str5="Hem";
	int val1=5;
	int val2=6;
	
	@Test
	public void testAdd(){
		assertEquals("Hem",str1);
		//assertNotNull(str3);
		assertFalse(val1>10);
		assertSame(str4,str5);
		assertNotSame(str1,str2);
	}
}
