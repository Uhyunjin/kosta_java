package com.kosta.exam03;

import java.util.ArrayList;

class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	public void sayHello() {
		System.out.println("hello "+name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class ArrayTest3 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		//제네릭 설정 후 Person의 객체 및 후손객체만 담을 수 있다.
		//list.add(100);
		//list.add("자바");
		//list.add(true);
		
		list.add(new Person("spring", 18));
		list.add(new Person("winter", 33));
		list.add(new Person("summer", 29));
		list.add(new Person("autumn", 25));
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);

			((Person)p).sayHello();
		}
		
		for (Person p : list) {
			System.out.println(p);
			p.sayHello();
		}
	}
}
