package com.lti.payroll;

public class Payroll {
	
	private double organizationBankBalance=999999999999999.99;
	public void salaryDo(Employee emp){
		organizationBankBalance-=emp.getSalary();
		System.out.println("salary get issued to "+emp.getName()+" whos psno is "+emp.getPsno()+" salary is "+emp.getSalary());
	}
	
	public double getAvailableBalance()
	{
		return organizationBankBalance;
	}

}
