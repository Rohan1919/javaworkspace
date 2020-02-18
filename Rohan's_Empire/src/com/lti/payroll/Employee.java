package com.lti.payroll;

import java.time.LocalDate;

public class Employee {
	private int psno;
	private String name;
	private LocalDate dateOfJoining;
    private double salary;
    public Employee() {
		// TODO Auto-generated constructor stub
	}
    public Employee(int psno, String name, LocalDate dateOfJoining, double salary) {
		super();
		this.psno = psno;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
	public int getPsno() {
		return psno;
	}
	public void setPsno(int psno) {
		this.psno = psno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateofjoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    
    
    
}
