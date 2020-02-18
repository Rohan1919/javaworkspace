package com.lti.v2;

import java.io.FileWriter;
import java.io.IOException;
import java.net.Inet4Address;
import java.time.LocalDateTime;

public class FileLogger extends Logger {
	
    public void log(String msg, LogLevel level) {
		String ip="127.0.0.1";
		try{
			ip=Inet4Address.getLocalHost().getHostAddress();
			
		}
		catch(Exception e){
			
		}
		try(FileWriter fw=new FileWriter("d:\\app1.log",true)){
			
			
		
		switch(level){
		case INFO:
			fw.write("[INFO]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
			break;
		case WARN:
			fw.write("[WARNING]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
			//ipAddress();
			break;
		case ERROR:
			fw.write("[ERROR]["+LocalDateTime.now()+"]"+msg+" having ip address is:"+ip);
			//ipAddress();
			break;
		
		  }
	    }
		catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
    }

}
