package com.interfaceExample;

public class ATM implements Bank{
	@Override
	public void cashWithdrawl() {
	
	System.out.println("withdrawl");
	}
	@Override
	public void cashDeposit() {
		System.out.println("Desposits");
	}
	@Override
	public void statement() {
		System.out.println("Statement");
	}
	@Override
	public void balance() {
		System.out.println("Balance");
	}
	public static void main(String[] args) {
		ATM a = new ATM();
		a.cashWithdrawl();
		a.cashDeposit();
		a.statement();
		a.balance();
	}
}
