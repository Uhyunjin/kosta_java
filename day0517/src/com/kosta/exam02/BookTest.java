package com.kosta.exam02;

class Book{
	private String title;
	private String author;
	public void setTitle(String t){
		title = t;
	}
	public void setAuthor(String a){
		author = a;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		
		b1.setTitle("재미있는 자바");
		b2.setTitle("신나는 자바");	
		b1.setAuthor("author1");
		b2.setAuthor("author2");
		
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println("----------------------");
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		
		
		
	}
}
