package com.kosta.exam03;

public class Person implements Runnable {
	private String name;
	public Person(String name) {
		super();
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello, "+name+"==>"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//1초 동안 대기하라
		}
	}
	
}
