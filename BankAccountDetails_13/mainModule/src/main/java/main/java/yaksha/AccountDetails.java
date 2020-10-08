package main.java.yaksha;

import java.util.Scanner;


 import com.lgsoft.Account;

public class AccountDetails {
Scanner sc=new Scanner(System.in);
	
	public Account getAccountDetails() {
		Account acc=new Account();
	 
		int balance;
		
		System.out.println("Enter account id:");
		int accountId=sc.nextInt();
		acc.setAccountId(accountId);
		System.out.println("Enter account type:");
		String accountType=sc.next();
		acc.setAccountType(accountType);
		System.out.println("Enter balance:");
		  balance=sc.nextInt();
		if(balance<=0) {
			System.out.println("Balance should be positive");
			System.out.println("Enter balance:");
			  balance=sc.nextInt();
		}
		acc.setBalance(balance);
		 
		return acc;
		
		
		
	}
	public int getWithdrawAmount() {
		int withDraw;
		System.out.println("Enter amount to be withdrawn:");
		  withDraw=sc.nextInt();//500
		if(withDraw<=0) {
			System.out.println("Amount should be positive");
			System.out.println("Enter amount to be withdrawn:");
			  withDraw=sc.nextInt();
		}
		
		return withDraw;//500
		
		
	}
	
	
	public static void main(String[] args) {
		AccountDetails ad=new AccountDetails();
		Account a=ad.getAccountDetails();
           		
		int withDrawBalance=ad.getWithdrawAmount();
		a.withdraw(withDrawBalance);
		
}
}
