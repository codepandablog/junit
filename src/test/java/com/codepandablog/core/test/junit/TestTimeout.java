package com.codepandablog.core.test.junit;

import org.junit.Test;

public class TestTimeout {

	String message = "Hem";	
	MessageUtils messageUtil = new MessageUtils(message);
	
	@Test(timeout=1000)
	public void testPrintMessage(){
		System.out.println("inside test print message...");
		messageUtil.printMessage();
		
	}
}
