package com.kosta.exam01;

class Book{
	private String title;
	private String author;
	// 속성
	
	public void setTitle(String t){
		title = t;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		//b참조변수가 바라보고 있는 곳은 title과 author로 구성
		Book b2 = new Book();
		// new : 객체를 생성해주세요 라는 의미 자료형은 Book
		// book의 구성요소, 멤버 만큼 힙에 메모리가 생성된다.
		
		//b1.title = "재미있는 자바";
		
		//

	}
}
