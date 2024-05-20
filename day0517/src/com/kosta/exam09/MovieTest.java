package com.kosta.exam09;

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
	
	
	public Movie(String title, String director, String production){
		this.title = title;
		this.director = director;
		this.production = production;
	}
	public Movie(){
		//System.out.println("매개변수를 갖지 않는 생성자 동작함");
		this("제목 없음", "감독 없음", "제작사 없음");
		//제일 첫 줄에 와야합니다^^
	}

	
	}
public class MovieTest {
	public static void main(String[] args) {
		
	}

}
