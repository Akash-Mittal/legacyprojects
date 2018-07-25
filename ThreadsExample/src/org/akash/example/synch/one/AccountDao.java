package org.akash.example.synch.one;

import java.util.Scanner;

public class AccountDao extends Thread {

		private  Account account;
		private int amount=0;
		
		public AccountDao() {
		}
		public AccountDao(Account account,int amount) {
		this.account=account;
		this.amount=amount;
		}
		
		public   void checkBalance(){
			System.out.println("BALANCE :"+this.account.getAccountBalance());
		}

		public synchronized void withDraw(int amount) throws InterruptedException {
				Thread.sleep(500);
				int temp = this.account.getAccountBalance();
				System.out.println(this.getName()+this.account.getAccountHolderName()+" OLD BALANCE : "+temp );
				temp = temp - amount;
				System.out.println(this.getName()+this.account.getAccountHolderName()+" NEW BALANCE : "+temp );
				this.account.setAccountBalance(temp);
				System.out.println("-----------------------------------------");
		}
		
		public synchronized  void deposit(int amount) {
			
				int temp = this.account.getAccountBalance();
				System.out.println(this.account.getAccountHolderName()+" OLD BALANCE : "+temp );
				temp = temp + amount;
				System.out.println(this.account.getAccountHolderName()+" NEW BALANCE : "+temp );
				this.account.setAccountBalance(temp);
				System.out.println("-----------------------------------------");
			
	
	}

	public void recption(){
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		int choice = scanner.nextInt();
		if(choice==1){
			System.out.println("Check.....");
		}
		else if(choice==2){
			System.out.println("Looking...");
		}
		else if(choice==3){
			System.out.println("Adding...");
		}
		else{
			System.err.println("Wrong Choice");
			System.out.println("PRESS 1:CHECK BALANCE");
			System.out.println("PRESS 2:WITHDRAW BALANCE");
			System.out.println("PRESS 3:DEPOSIT BALANCE");

		}
		scanner.close();
		}
	
	}	
		
	@Override
	public void run() {
	
		try {
			this.withDraw(amount);
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
public static void main(String[] args) throws Exception {
	
	Account account = new Account(40000,"Akash");
	AccountDao dao1 = new AccountDao(account, 5000);
	AccountDao dao2 = new AccountDao(account, 5000);
	AccountDao dao3 = new AccountDao(account, 5000);
	AccountDao dao4 = new AccountDao(account, 5000);
	dao1.setName("T1: ");
	dao2.setName("T2: ");
	dao3.setName("T3: ");
	dao4.setName("T4: ");
	
	dao1.join();
	dao2.join();
	dao3.join();
	dao4.join();
	
	dao1.start();
	dao2.start();
	dao3.start();
	dao4.start();
	
}	


}
