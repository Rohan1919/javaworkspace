package com.lti.objectclass;

public class App {
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("rohan");
		p1.setAge(99);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
        Class cls=p1.getClass();
        System.out.println("class name is  ---->"+ cls);
 		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		Person p2=new Person();
		p2.setName("rohan");
		p2.setAge(99);
		System.out.println(p1==p2);
		//reference comparison in case of objects
		System.out.println(p1.equals(p2));//override the hashcode and equals method for getting the value true.
		System.out.println((p1.getName()).equals(p2.getName()));//value comparison
		
		Employee e1=new Employee(1,"rohan",1000);
		Employee e2=new Employee(1,"rohan",1000);
		
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2)+"hello");
		String s="abc";
		String d="abc";
		
		System.out.println(s.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.toString());
        System.out.println(e2.toString());

		
	}

}
