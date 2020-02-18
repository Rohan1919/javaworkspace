package com.lti.rawexample;

public class Calculator {
	public int add(int x,int y){
		return x+y;
	}
	public static int sub(int x,int y){
		return x-y;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int result=c.add(10,20);
		System.out.println(args[0]);
		System.out.println(result);
		System.out.println(Calculator.sub(50,20));
		System.out.println(Math.sqrt(4));
	}

}
