package com.lti.trial;

public class Hello {
	
	static{
		System.out.println("static initializer block class");//call only once
	}
	{
		System.out.println("non static initializer block of hello class");
	}
	public Hello()
	{
		System.out.println("constructor of hello class");
	}
	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		System.out.println(h1.toString());
	}

}
