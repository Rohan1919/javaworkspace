package com.lti.inheritance;

public class Broker extends Person {
	
	private String businessName,s;
	private Address address;
	private Property[] properties=new Property[999];//has-a   :one -to- many :use array
	private int count;
	
	public Broker() {
		// TODO Auto-generated constructor stub
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	/*public Property[] getProperties() {
		return properties;
	}
	public void setProperties(Property[] properties) {
		
		this.properties = properties;
	}*/
	public void addProperties(Property properties)
	{
	 
	   this.properties[count++]=properties;	
	}
	public void displayPropertiesForSale(){
		for(int i=0;i<count;i++)
		{
			/*
		 s=properties[i].toString();
		 System.out.println(s);
		*/
			Owner owner=properties[i].getOwner();
			System.out.println(owner.getName());
			//similarly print other details of owner
			Address address=properties[i].getAddress();
			System.out.println(address.getCity());
			//similarly print other details of address
			if(properties[i] instanceof Shop)
			{
				Shop shop=(Shop) properties[i];
				System.out.println(shop.getLicenseNo());
				System.out.println("-------------------------------------------------------------------------");
			}
			else if(properties[i] instanceof Flat)
			{
				Flat flat=(Flat) properties[i];
				System.out.println(flat.getType());
				System.out.println("-------------------------------------------------------------------------");
				}
			
		}
		
	}
	public Broker(String businessName, Address address, Property[] properties) {
		super();
		this.businessName = businessName;
		this.address = address;
		this.properties = properties;
	}
	
	
}
