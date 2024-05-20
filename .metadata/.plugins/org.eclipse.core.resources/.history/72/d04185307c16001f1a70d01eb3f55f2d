package com.kosta.exam09;

public class Rect extends Shape {
	
	private int height;
	private int width;

	public Rect() {}
	public Rect(int x, int y, int height, int width) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public Rect(int height, int width) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {
		area = width*height;
	}

	@Override
	public void calcRound() {
		round = 2*(width+height);
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rect [height=" + height + ", width=" + width + ", x=" + x + ", y=" + y + ", area=" + area + ", round="
				+ round + "]";
	}
	
	

}
