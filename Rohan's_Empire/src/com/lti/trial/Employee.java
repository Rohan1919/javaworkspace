package com.lti.trial;

public class Employee { 
	private final int empno;
	private String name;
	private static double salary;
	//public Employee() {
		
	//}
	public static final String COMPANY_NAME="LTI";
	
	public Employee(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Ram",10000);
		Employee e2=new Employee(102,"Shyam",20000);
		//e1.emp=908;
		System.out.println(e1.salary);
		System.out.println(e2.salary);
        System.out.println("name of ompany :"+Employee.COMPANY_NAME);
        System.out.println(Math.PI);
	}
	

}
