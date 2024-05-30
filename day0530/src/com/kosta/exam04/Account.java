package com.kosta.exam04;

public class Account {	//모금액을 위한 클래스
	
	private int balance;	//잔액을 위한 변수
	
	public void call(int amount) {	//입금을 위한 메서드
		balance+=amount;
	}
	
	public int getBalance() {
		return balance;
	}
}
