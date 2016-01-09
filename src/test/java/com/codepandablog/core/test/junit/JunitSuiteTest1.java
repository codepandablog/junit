package com.codepandablog.core.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitSuiteTest1 {

	MessageUtils messageUtil = new MessageUtils();
	
	@Test
	public void testSalutation(){
		String name="Hem";
		assertEquals("HiHem",messageUtil.salutationMessage(name));
	}
}
