package com.lti.v2;

import java.net.Inet4Address;
//import java.net.InetAddress;
//import java.net.UnknownHostException;
import java.time.LocalDateTime;

/**
 * A Simple Logger Implementation
 * @author Rohan
 * @version 1.0
 *
 */

public class Logger {
	
	public void log(String msg){
		/*String ip="127.0.0.1";
		try{
			ip=Inet4Address.getLocalHost().getHostAddress();
		}
		catch(Exception e){
			
		}
		System.out.println("[INFO]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
        */
		log(msg,LogLevel.INFO);
	}
	/*public void ipAddress() throws UnknownHostException{
		InetAddress IP = InetAddress.getLocalHost();
	    System.out.println("machine local address is"+IP);
	}*/
	public void log(String msg, LogLevel level) {
		System.out.println("the message from log first");
	}

}
