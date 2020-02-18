package com.lti.v1;

//import java.net.UnknownHostException;

public class App {
	public static void main(String[] args) //throws UnknownHostException 
	{
		Logger logger =new Logger();
		logger.log("some mesages");
		logger.log(" again some mesages",LogLevel.WARN);
		logger.log("once again some mesages",LogLevel.ERROR);
		
	}

}
