package com.kosta.exam12;

class Movie{
	private String title;
	private String director;
	private String production;
		
	public void setTitle(String title){
		this.title = title;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public void setProduction(String production){
		this.production = production;
	}
	
	public String getTitle(){
		return title;
	}
	public String getDirector(){
		return director;
	}
	public String getProduction(){
		return production;
	}

	
	}
public class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie();
		// 자바의 기본생성자가 제공된다.
		System.out.println(m.getTitle());
	}
}
