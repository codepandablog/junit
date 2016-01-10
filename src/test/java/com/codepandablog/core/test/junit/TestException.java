package com.codepandablog.core.test.junit;

import org.junit.Test;

public class TestException {

	String message = "Hem";	
	MessageUtils messageUtil = new MessageUtils(message);
	
	@Test(expected=ArithmeticException.class)
	public void testPrintMessage(){
		System.out.println("inside test print message...");
		messageUtil.printMessage();
		
	}
}
