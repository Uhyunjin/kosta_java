package com.kosta.exam03;

public class Poet extends Book {
	
	int lateFees;

	@Override
	public int getLateFees(int days) {
		lateFees = 200*days;
		return lateFees;
	}

	public Poet(String no, String title, String author) {
		super(no, title, author);
	}
	
	public Poet() {}

	@Override
	public String toString() {
		return "Poet [lateFees=" + lateFees + ", no=" + no + ", title=" + title + ", author=" + author + "]";
	}


}
