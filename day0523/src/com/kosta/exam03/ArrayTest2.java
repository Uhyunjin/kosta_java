//package com.kosta.exam03;
//
//import java.util.ArrayList;
//
//class Person{
//	
//	String name;
//	int age;
//	
//	public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//		
//	}
//	public void sayHello() {
//		System.out.println("hello"+name);
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	
//}
//
//public class ArrayTest2 {
//	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add(100);
//		list.add("자바");
//		list.add(true);
//		list.add(new Person("홍길동", 20));
//		list.add(new Person("임꺽정", 29));
//		
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//			//리스트에 담긴 요소가 만약 person이면 sayhello동작
//			if (obj instanceof Person) {
//				((Person)obj).sayHello();
//			}
//		}
//	}
//}
