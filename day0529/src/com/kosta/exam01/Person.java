package com.kosta.exam01;

public class Person {

	private String name;
	public Person(String name) {
		super();
		this.name=name;
	}
	
	public void sayHello() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello, "+name+"==>"+i);
			
			try {
				Thread.sleep(1000);	//1초 동안 대기하라
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
}
