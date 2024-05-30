package com.kosta.exam01;

public class PersonTest {
	public static void main(String[] args) {
		Person spring = new Person("Spring");
		Person summer = new Person("Summer");
		Person autumn = new Person("Autumn");
		Person winter = new Person("Winter");
		
		spring.start();
		summer.start();
		autumn.start();
		winter.start();
	}
}
