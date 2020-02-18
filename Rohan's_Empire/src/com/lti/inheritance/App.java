package com.lti.inheritance;

public class App {

	public static void main(String[] args) {
		
		Owner owner=new Owner();
		owner.setName("Ram");
		owner.setAge(25);
		owner.setProfession("software engineer");
		
		Flat flat=new Flat();
		flat.setOwner(owner);
		flat.setType("1BHK");
		
		Address address=new Address();
		address.setCity("mumbai");
		address.setLandmark("near lti");
		address.setPincode(411111);
		address.setStreet("mahape road");
	    
		flat.setAddress(address);
		
		Address address1=new Address();
		address1.setCity("mumbai");
		address1.setLandmark("near jio");
		address1.setPincode(411321);
		address1.setStreet("thane road");
	    
		Owner owner_s1=new Owner();
		owner_s1.setName("Shyam");
		owner_s1.setAge(24);
		owner_s1.setProfession("Teacher");
		
		
		Shop shop=new Shop();
		shop.setLicenseNo(1111);
		shop.setAddress(address1);
		shop.setOwner(owner_s1);
		
		Broker broker=new Broker();
		broker.setAddress(address);
		broker.setAge(29);
		broker.setBusinessName("brokerbhaiyya");
		broker.setName("raju");
		broker.addProperties(shop);
		broker.addProperties(flat);
		
		broker.displayPropertiesForSale();
		
	
	}	
	

}
