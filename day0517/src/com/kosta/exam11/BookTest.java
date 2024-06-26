package com.kosta.exam11;

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
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		this("제목없음", "저자없음");
	}
	
	public Book(String title) {
		this(title, "저자없음");
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("재미있는 자바", "author1");
		Book b2 = new Book("재미있는 자바");
		Book b3 = new Book();

		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println("-----------------------");
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println("-----------------------");
		System.out.println(b3.getTitle());
		System.out.println(b3.getAuthor());

	}
}
