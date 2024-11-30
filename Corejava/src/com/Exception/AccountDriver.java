package com.Exception;

public class AccountDriver {

	public static void main(String[] args) {
		Account a = new Account(1000);
			try {
				a.withdraw(1200);
			}catch(InsufficientBalException e) {
				System.out.println(e.getMessage());
			}
		

	}

}
