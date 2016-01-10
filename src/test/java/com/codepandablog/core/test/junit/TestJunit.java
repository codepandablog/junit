package com.codepandablog.core.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
	public void testAdd(){
		String name="Hem Chandra";
		assertEquals("Hem Chandra",name);
	}
}
