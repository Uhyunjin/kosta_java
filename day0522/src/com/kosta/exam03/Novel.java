package com.kosta.exam03;

public class Novel extends Book {
	
	int lateFees;

	@Override
	public int getLateFees(int days) {
		lateFees = 300*days;
		return lateFees;
	}

	public Novel(String no, String title, String author) {
		super(no, title, author);
	}
	
	public Novel() {}

	@Override
	public String toString() {
		return "Novel [lateFees=" + lateFees + ", no=" + no + ", title=" + title + ", author=" + author + "]";
	}


}
