package com.kosta.exam14;

class Person{
	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	
	public Person(String name, int Age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	// public Person() {}
}

public class PersonTest {

	public static void main(String[] args) {
		// Person person = new Person();
		//System.out.println(person.getName());
		//System.out.println(person.getAge());
		//System.out.println(person.getHeight());
	}

}
