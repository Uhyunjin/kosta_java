package com.kosta.exam02;

import java.util.Iterator;

public class Person extends Thread{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" eats : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
