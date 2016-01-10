package com.codepandablog.core.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeDetails {

	EmployeeDetails details=new EmployeeDetails();
	EmpBusinessLogic logic=new EmpBusinessLogic();
	
	@Test
	public void testCalculateAppraisal(){
		details.setAge(25);
		details.setMonthlySalary(2500.0);
		details.setName("Hem Chandra");
		double appraisal=logic.calculateAppraisal(details);
		//System.out.println(appraisal);
		assertEquals(1500.0,appraisal,0.1);
	}
	
	@Test
	public void testYearlySalary(){
		details.setAge(25);
		details.setMonthlySalary(2500.0);
		details.setName("Hem Chandra");
		double yearlySalary=logic.getYearlySalary(details);
		assertEquals(30000.0,yearlySalary,0.1);
	}
}
