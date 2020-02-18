package com.lti.threading;
public class Example{
private class Task1 implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<1000;i++){
			//try{Thread.sleep(100);}catch(Exception e){}
			Thread.yield();
			System.out.println("i is: "+i);
		}
		
	}
}
private class Task2 implements Runnable{
     public void run() {
    		
		for(int i=0;i<1000;i++){
			//try{Thread.sleep(100);}catch(Exception e){}
			Thread.yield();
			System.out.println("j is: "+i);
		}
		
	}
	
}

private void launch(){
	Thread th1=new Thread(new Task1());
	Thread th2=new Thread(new Task2());
	//th1.setPriority(1);
	//th2.setPriority(10);
	//th1.setPriority(Thread.MIN_PRIORITY);
	//th2.setPriority(Thread.MAX_PRIORITY);
	
	//th1.setDaemon(true);
	//th2.setDaemon(true);
	
	th1.start();
	th2.start();
}

public static void main(String[] args) {
	new Example().launch();
}
}