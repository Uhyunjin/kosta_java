package com.kosta.exam05;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("book title", 256, "book author");
		Magazine m = new Magazine("Magazine title", 66, "Magazine author", "2024/5/20");

		
		System.out.println(b);
		System.out.println(m);
		
		
		Magazine m2 = new Magazine();
		// 부모의 매개변수를 갖지 않는 생성자가 요청됨
		System.out.println(m2);
	}

}
