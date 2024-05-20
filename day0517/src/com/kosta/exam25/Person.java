package com.kosta.exam25;

public class Person {
	
	private String name;
	private int age;
	
	public String toString() {
		return "[이름 : "+name+", 나이 : "+age+"]";
	}
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
	public Person() {
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
