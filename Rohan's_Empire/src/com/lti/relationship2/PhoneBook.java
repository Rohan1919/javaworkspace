package com.lti.relationship2;

import java.util.Scanner;

public class PhoneBook {

	/* private String[] names;
	 * private String[] numbers;
	 * private String[] emails;
	 *  
	 * */
	private int count;
     private Contact[] contacts;
     
     public PhoneBook(){
    	 contacts=new Contact[100];
     }
     public PhoneBook(int noOfEntries) {
    	 contacts=new Contact[noOfEntries];
     }
     
     public void add(Contact contact)
     {
    	 contacts[count++]=contact;
     }
     public void display()
     {
    	 for(int i=0;i<count;i++){
    	 System.out.println("Name:-   "+ contacts[i].getName());
    	 System.out.println("Number:- "+contacts[i].getNumber());
    	 System.out.println("email:-  "+contacts[i].getEmail());
     } 
   }

}
