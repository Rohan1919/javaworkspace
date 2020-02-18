package com.lti.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//creating object of class calculator
		Calculator c = new Calculator();
		
		//same thing using reflection api
		//Class cz=Calculator.class;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter class name :");
		String className=s.nextLine();
		Class cz=Class.forName(className); 
		//Object obj = cz.newInstance();
		//System.out.println(obj);
		//Class cz=Class.forName(classname);
		//Object obj=cz.newInstance();
		System.out.println("following are methods of above class: ");
		Method[] methods=cz.getMethods();
		for (Method m:methods){
			System.out.println(m.getName());
		}
		
	}

	@Override
	public String toString() {
		return "Example [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
