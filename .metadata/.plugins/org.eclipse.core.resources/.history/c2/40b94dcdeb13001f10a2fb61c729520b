package com.kosta.exam07;

class Book{
	private String title;
	private String author;
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	
	public Book(String title, String author){
		System.out.println("생성자 동작");
		this.title = title;
		this.author = author;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("재미있는 자바", "author1");

		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		
		Book b2 = new Book("재미있는 파이썬", "author2");
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
	}
}
