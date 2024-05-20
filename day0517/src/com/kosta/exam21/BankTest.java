package com.kosta.exam21;

public class BankTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount("a1",0101,100,0.075);
		BankAccount a2 = new BankAccount("a2",1234,50,0.075);

		System.out.println("a1 : "+a1.getBalance());
		System.out.println("a2 : "+a2.getBalance());
		System.out.println("---------------------");

		
		a1.withdraw(60);
		a2.withdraw(60);
		
		a1.printBalance();
		a2.printBalance();
		System.out.println("---------------------");
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance();
		a2.printBalance();

		
	}
}
