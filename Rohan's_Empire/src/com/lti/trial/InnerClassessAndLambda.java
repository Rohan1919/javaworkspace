package com.lti.trial;

import java.time.LocalDate;



class Passport{
	Identity identity;
	LocalDate issueDate;
	LocalDate expiryDate;
	class Identity{
		
		String passportNo;
		String country;
    }

}
class Person{
	Identity identity;
	String name;
	int age;
	class Identity{
		long aadharCardnumber;
		String religion;
		
	}
}

@FunctionalInterface
interface Printer{
	void print();
}

class DotMattrixPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("Printing done......");
		
	}
	
	
}
public class InnerClassessAndLambda {
	public static void main(String[] args) {
		Printer p=new DotMattrixPrinter();
		p.print();
		class InkjetPrinter implements Printer{

			@Override
			public void print() {
				System.out.println("Printing done......");
				
			}
			
			
		}
		Printer pi=new InkjetPrinter();
		pi.print();
        //anonymous inner classes -- class without a name
		
		Printer pr=new Printer(){
			

			@Override
			public void print() {
			
				System.out.println("Printing done annonymously");
			}
			
			
		};
		pr.print();
		///
		//
		//labda expression-- anonymous functions
		Printer pp=()->{//() -- start from method
			System.out.println("printing done method with class");
		};
		pp.print();//for only if interface or class has only one abstract method
		

	}

}
