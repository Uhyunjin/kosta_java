package com.kosta.exam21;

public class BankAccount{
	//메서드의 동작 방식이 변경하는것은 호출하는 쪽에서 수정할 부분이 없다
	//그러나 멤버변수인 balance의 자료형은 int에서 double로 변경하면 호출한 쪽에서도 수정 필요
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
