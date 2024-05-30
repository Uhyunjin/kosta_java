package com.kosta.exam07;

public class Account {	//모금액을 위한 클래스
	
	private int balance;	//잔액을 위한 변수
	
	public synchronized void call(String name, int n, int amount) {	//입금을 위한 메서드
		System.out.println(name+"의 "+n+"번째 입금");
		if (balance>=100000) {
			System.out.println("입금실패1!!---------------------------");
			return;
		}
		balance+=amount;
		System.out.println("=====================================");
	}
	
	public int getBalance() {
		return balance;
	}
}
