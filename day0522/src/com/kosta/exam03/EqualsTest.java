package com.kosta.exam03;

public class EqualsTest {
	public static void main(String[] args) {
		Person p1 = new Person("spring", 20);
		Person p2 = new Person("spring", 20);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
