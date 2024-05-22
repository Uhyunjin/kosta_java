package com.kosta.exam03;

public class BookTest {
	public static void main(String[] args) {
		
		Book n = new Novel("book1", "888", "Spring");
		Book p = new Poet("book2", "832", "Summer");
		Book s = new ScienceFiction("book3", "890", "Autumn");
				
		n.getLateFees(8);
		p.getLateFees(7);
		s.getLateFees(3);
		
		System.out.println(n);
		System.out.println(p);
		System.out.println(s);
		
		ScienceFiction s2 = new ScienceFiction("book3", "890", "Autumn");
		
		System.out.println(s2.equals(s));
		System.out.println(s2.equals(n));
		// 각각 book의 자식 클래스로 생성했을때는 equals 메서드 사용시 다른 자료형이라고 알림이 뜬당
	}

}
