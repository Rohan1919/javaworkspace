
package com.lti.v2;

import java.net.Inet4Address;
import java.time.LocalDateTime;

public class ConsoleLogger extends Logger{

	/*public void ipAddress() throws UnknownHostException{
		InetAddress IP = InetAddress.getLocalHost();
	    System.out.println("machine local address is"+IP);
	}*/
	public void log(String msg, LogLevel level) {
		String ip="127.0.0.1";
		try{
			ip=Inet4Address.getLocalHost().getHostAddress();
			
		}
		catch(Exception e){
			
		}
		
		switch(level){
		case INFO:
			System.out.println("[INFO]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
			
			break;
		case WARN:
			System.out.println("[WARNING]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
			//ipAddress();
			break;
		case ERROR:
			System.out.println("[ERROR]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
			//ipAddress();
			break;
		
		}
	}

}
