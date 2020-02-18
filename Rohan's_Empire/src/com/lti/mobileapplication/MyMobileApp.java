package com.lti.mobileapplication;

public class MyMobileApp implements MobileApplication {
	public void start(){
		System.out.println("mobile application start");
	}

	@Override
	public void pause() {
		System.out.println("mobile application pause");
		
	}

	@Override
	public void stop() {
		System.out.println("mobile application stOP");
		
	}

}
