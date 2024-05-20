package com.kosta.exam13;

class Person{
	private String name;
	private int age;
	private double heigth;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return heigth;
	}
	
	public Person() {}
	//매개변수가 없는 기본생성자
	//자바에서 제공
}

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getHeight());
	}

}
