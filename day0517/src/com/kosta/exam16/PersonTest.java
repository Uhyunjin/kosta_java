package com.kosta.exam16;

class Person{
	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Person() {
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person("홍길동",50,188.8);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getHeight());
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getHeight());
	}

}
