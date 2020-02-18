package com.lti.threading;

class BankAccount{
int accno;
double balance;

public BankAccount() {
	// TODO Auto-generated constructor stub
}

public BankAccount(int accno, double balance) {
    this.accno = accno;
	this.balance = balance;
}

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	
	this.balance = balance;
}
synchronized void withdraw(double amount ){
	try{
		Thread.sleep(100);
		if(amount<balance){
			Thread.sleep(100);
			balance-=amount;
			Thread.sleep(100);
			System.out.println("balance left "+ balance);
			
		}
		else
			System.out.println("insufficient balance");
	}
	catch(InterruptedException e){
		}
	
}
} 

class Transaction implements Runnable{
   
       BankAccount bankacc;
	
	public Transaction(BankAccount bankacc) {
		
		this.bankacc = bankacc;
	}
	@Override
	public void run() {
		
		//bankacc.withdraw(bankacc.getBalance());
		bankacc.withdraw(5000);
	}

	
	
}

class Synchronization {
	public static void main(String[] args) {
		BankAccount bankAcc1=new BankAccount(1111,7000);
		//BankAccount bankAcc2=new BankAccount(2222,8000);
		Transaction tx1=new Transaction(bankAcc1);
		Transaction tx2=new Transaction(bankAcc1);
		
		Thread th1=new Thread(tx1);
		Thread th2=new Thread(tx2);
		th1.start();
		th2.start();
	}
}
