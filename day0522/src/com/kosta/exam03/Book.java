package com.kosta.exam03;

import java.util.Objects;

public abstract class Book {
	
	protected String no;
	protected String title;
	protected String author;
	
	public abstract int getLateFees(int days);
	
	public Book(String no, String title, String author) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}
	@Override
	public boolean equals(Object obj) {
		Book b = (Book)obj;
		return no.equals(b.no);
	}
	
	
	
}
