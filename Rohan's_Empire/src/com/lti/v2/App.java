package com.lti.v2;

//import java.net.UnknownHostException;

public class App {
	public static void main(String[] args) //throws UnknownHostException 
	{
		ConsoleLogger logger =new ConsoleLogger();
		/*FileLogger flogger=new FileLogger();
		flogger.log("some mesages");
		flogger.log(" again some mesages",LogLevel.WARN);
		flogger.log("once again some mesages",LogLevel.ERROR);
		*/
		logger.log("some mesages");
		logger.log(" again some mesages",LogLevel.WARN);
		logger.log("once again some mesages",LogLevel.ERROR);
	}

}
