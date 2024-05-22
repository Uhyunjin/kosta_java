package com.kosta.exam03;

public class ScienceFiction extends Book {
	
	int lateFees;

	@Override
	public int getLateFees(int days) {
		lateFees = 600*days;
		return lateFees;
	}

	public ScienceFiction(String no, String title, String author) {
		super(no, title, author);
	}
	
	public ScienceFiction() {}

	@Override
	public String toString() {
		return "ScienceFiction [lateFees=" + lateFees + ", no=" + no + ", title=" + title + ", author=" + author + "]";
	}


}
