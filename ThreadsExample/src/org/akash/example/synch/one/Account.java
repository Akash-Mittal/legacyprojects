package org.akash.example.synch.one;

public class Account {
	private int accountBalance;
	private String accountHolderName;
	public Account() {
		this.accountBalance = 0;
		this.accountHolderName = "Default";
	}
	
	public Account(int accountBalance, String accountHolderName) {
		super();
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	@Override
	public String toString() {
		return "Account [accountBalance=" + accountBalance
				+ ", accountHolderName=" + accountHolderName + "]";
	}
	
	
	

}
