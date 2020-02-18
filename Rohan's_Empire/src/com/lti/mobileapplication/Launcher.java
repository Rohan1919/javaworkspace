package com.lti.mobileapplication;

public class Launcher {
	public void launch(MobileApplication mobileapp){//my any application should implements the  methods in interface
		    mobileapp.start();
			mobileapp.pause();
			mobileapp.stop();
	}

}
