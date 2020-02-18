package com.lti.exceptionexample;

public class BankAccount {
	
	private long acno;
	private double balance;
	
	
   public BankAccount(long acno,double balance){
	this.acno=acno;
	this.balance=balance;
	
   }
   
   public double withdrawal(double amount) throws Exception{
	  if(amount> balance){
		  //Exception e=new Exception("insuffiecient Balance");
		  Exception e=new Exception("insuffiecient Balance");
		  throw e;//
	  }
	  else{
		  balance-=amount;
	   return balance;
	  }   
   }
   public static void main(String[] args) {
	BankAccount bankacc=new BankAccount(12345, 5000);
	try{
		double balance=bankacc.withdrawal(6000);
		System.out.println("balance left"+balance);
	}
	catch(Exception e){
		System.out.println("there is error");
	}
}

}
