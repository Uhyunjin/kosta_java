package com.kosta.exam03;

public class B extends A {
	//B는 A에 있는 모든 속성을 물려받게 된다.
	
	private String data;
	
	
	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public void info() {
		System.out.println(title + year + data);
		
	}	
}
