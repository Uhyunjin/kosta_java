package com.kosta.exam03;

public class MyDateTest {
	public static void main(String[] args) {
		
		try {
			new MyDate();
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
