package com.kosta.exam03;
import java.util.Scanner;

class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String message){
		super(message);
	}
}


class BankAccount
{
	String name;
	double balance;

	public BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
	};

	public void deposit(double money){

		balance += money;
		System.out.println("현재 잔액 : "+balance);
	}

	public void withdraw(double money)throws NegativeBalanceException{

		if (balance-money<0)
		{
			throw new NegativeBalanceException("잔액이 부족합니다 현재 잔액 : "+balance);
		}else{
			balance -= money;
			System.out.println("현재 잔액 : "+balance);
		}
	}
}


class BankAccountTest
{
	public static void menu() {
		System.out.println("[1]입금 [2]출금 [3]잔액조회 [0]나가기");
	}

	public static void main(String[] args) 
	{	
		double money;
		Scanner sc = new Scanner(System.in);
		BankAccount a = new BankAccount("a",0);
		int sel;
		try
		{
			while(true) {
				menu();
				sel = sc.nextInt();
				
				if (sel==0) {
					break;
				}
				switch (sel) {
				case 1:
					System.out.println("얼마를 입금하시나요?");
					money = sc.nextDouble();
					a.deposit(money);
					break;
				case 2:
					System.out.println("얼마를 출금하시나요?");
					money = sc.nextDouble();
					a.withdraw(money);
					break;
				case 3:
					System.out.println(a.balance);
				}
			}
		}
		catch (NegativeBalanceException e)
		{
			System.out.println("예외발생 "+e.getMessage());
			//System.out.println(e);
			//e.printStackTrace();
		}
		
	}
}
