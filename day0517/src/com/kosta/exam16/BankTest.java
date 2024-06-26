package com.kosta.exam16;

class BankAccount{
	String name;
	int account;
	int balance;
	double rate;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String name, int account, int balance, double rate) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		if (balance<amount) {
			System.out.println(name+" : 잔액이 부족합니다.");
		}else {
			balance -= amount;			
		}
	}
	
	void printBalance() {
		System.out.println(name+" : "+balance);
	}
	
	void addInterest() {
		double addInt = balance + (balance*rate);
		System.out.println(addInt);
	}

	}

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
