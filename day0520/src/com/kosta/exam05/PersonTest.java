package com.kosta.exam05;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("summer", "인천시 서구", "010-0000-0000");
		Customer c = new Customer("spring", "서울시 종로구", "010-1111-1111", "1000","10000");
		System.out.println("*** Person의 정보 ***");
		System.out.println(p);
//		System.out.println("이름 : "+p.getName());
//		System.out.println("주소 : "+p.getAddr());
//		System.out.println("휴대폰번호 : "+p.getPhone());
		System.out.println("===================");
		System.out.println("*** Customer의 정보 ***");
		System.out.println(c);
//		System.out.println("이름 : "+c.getName());
//		System.out.println("주소 : "+c.getAddr());
//		System.out.println("휴대폰번호 : "+c.getPhone());
//		System.out.println("고객번호 : "+c.getNo());
//		System.out.println("마일리지 : "+c.getMileage());
	}

}
