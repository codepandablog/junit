package com.codepandablog.core.test.junit;

public class EmpBusinessLogic {

	public double getYearlySalary(EmployeeDetails details){
		double yearlySalary=0;
		yearlySalary=details.getMonthlySalary()*12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(EmployeeDetails details){
		double appraisal=0;
		if(details.getMonthlySalary()<500){
			appraisal=500;
		}else{
			appraisal=1500;
		}
		return appraisal;
	}
}
