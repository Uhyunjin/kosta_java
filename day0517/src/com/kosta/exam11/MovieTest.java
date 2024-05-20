package com.kosta.exam11;

class Movie{
	private String title;
	private String director;
	private String production;
		
	public void setTitle(String title){
		this.title = title;
	}
	
	public Movie(String title, String director, String production){
		this.title = title;
		this.director = director;
		this.production = production;
	}
	public Movie(){
		this("제목 없음", "감독 없음", "제작사 없음");
	}

	
	}
public class MovieTest {
	public static void main(String[] args) {
		
	}

}
