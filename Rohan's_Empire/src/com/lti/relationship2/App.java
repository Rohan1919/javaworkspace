package com.lti.relationship2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook pb=new PhoneBook(10);
		Contact c=new Contact();
		c.setName("rohan");
		c.setNumber("9876567890");
		c.setEmail("dfg@gmail.com");
		pb.add(c);
		
		Contact c1=new Contact();
		c1.setName("mohan");
		c1.setNumber("2276567890");
		c1.setEmail("dabc@gmail.com");
		pb.add(c1);
		Contact c2=new Contact();
		c2.setName("sohan");
		c2.setNumber("8976567890");
		c2.setEmail("dlkiu@gmail.com");
		pb.add(c2);
		Contact c3=new Contact();
		c3.setName("dipak");
		c3.setNumber("123567890");
		c3.setEmail("uio@gmail.com");
		pb.add(c3);
pb.display();



	}

}
