package com.codepandablog.core.test.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChacker primeNumberChacker;
	
	@Before
	public void initilize(){
		primeNumberChacker=new PrimeNumberChacker();
	}
	
	// Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public PrimeNumberCheckerTest(Integer inputNumber, 
      Boolean expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }
   
   @Parameterized.Parameters
   public static Collection primeNumbers(){
	   return Arrays.asList(new Object[][]{
		   {2,true},
		   {6,false},
		   {7,true}
	   });
   }
   
   @Test
   public void testPrimeNumberChecker(){
	   System.out.println("Input parameter is:"+inputNumber);
	   assertEquals(expectedResult,primeNumberChacker.validate(inputNumber));
	   primeNumberChacker.validate(inputNumber);
   }
}
