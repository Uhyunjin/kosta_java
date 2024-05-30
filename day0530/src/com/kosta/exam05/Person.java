package com.kosta.exam05;

public class Person extends Thread{	//성금자를 위한 클래스(전화를 걸어서 모금액 증가)
									// 다른 성금자와 상관없이 계속 입금을 위해 쓰레드 상속
	private String name;
	Account account;	//다른 성금자와 모금액을 공유하기 위하여 모금액 클래스인
						//Account를 멤버변수로 선언
	
	public Person(String name, Account account) {
		this.account  = account;
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {	//천원씩 열 번 입금하기
			account.call(1000);
			System.out.println(name+"의 "+i+"번째 입금");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
