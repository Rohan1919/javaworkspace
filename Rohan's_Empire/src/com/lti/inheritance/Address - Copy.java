package com.lti.inheritance;

public class Address {
	private String city,landmark,street;
	private int pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String landmark, String street, int pincode) {
		super();
		this.city = city;
		this.landmark = landmark;
		this.street = street;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
