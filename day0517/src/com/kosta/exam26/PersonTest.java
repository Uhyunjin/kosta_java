package com.kosta.exam26;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동",28);
		
		//System.out.println("이름 : "+p1.getName());
		//System.out.println("나이 : "+p1.getAge());
		
		//p1.info();
		System.out.println(p1.getInfo());
		
		Person p2 = new Person("김유신", 50);
		System.out.println(p2.getInfo());
	}

}
