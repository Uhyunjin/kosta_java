package com.kosta.exam05;

public class Magazine extends Book {
	
	protected String release;

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public Magazine(String title, int page, String author, String release) {
		super(title, page, author);
		this.release = release;
	}

	public Magazine() {
		super(null, 0, null);
		// TODO Auto-generated constructor stub
	}
//
//	public Magazine(String title, int page, String author) {
//		super(title, page, author);
//		// TODO Auto-generated constructor stub
//	}
	
	public String toString() {
		String data = "";
		data += super.toString();
		data += ", release=" + release;
		return data;
	}
}
