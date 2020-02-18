package com.lti.payroll;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
	
	public static void main(String[] args) {
		
		Payroll payroll=new Payroll();
		
		Manager manager=new Manager();
		manager.setPsno(101);
		manager.setName("Rohan");
		manager.setSalary(1500000);
		manager.setDateofjoining(LocalDate.of(2010,10,10));
		manager.setIncentives(5000);
		
		Developer dev=new Developer();
		dev.setName("Pavan");
		dev.setPsno(102);
		dev.setDateofjoining(LocalDate.of(2013, 10,10));
		dev.setSalary(100000);
		dev.setOvertime(24);
		
		payroll.salaryDo(manager);
		payroll.salaryDo(dev);
		
	}
     
}
