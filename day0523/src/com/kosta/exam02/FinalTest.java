package com.kosta.exam02;

final class Person{
	String name;
	int age;
	
	public void hello() {
		System.out.println("hello" + name);
	}
	public final void test() {
		System.out.println("A클래스의 test입니다");
	}
}
//class Student extends Person{
//	String major;
//	public void study() {
//		System.out.println("study" + major);
//	}
//}

public class FinalTest {
	public static void main(String[] args) {

	}

}
