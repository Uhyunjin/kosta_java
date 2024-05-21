package com.kosta.exam03;

public class Cube extends ThreeDimShape{
	private double width;
	private double height;
	private double length;
	

	@Override
	public void calcVolume() {
		volume = width*height*length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cube(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}//이거는 없어도 오류가 안나..


	public Cube(int x, int y, double width, double height, double length) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.length = length;
	}


	@Override
	public String toString() {
		return "Cube [width=" + width + ", height=" + height + ", length=" + length + ", volume=" + volume + ", x=" + x
				+ ", y=" + y + "]";
	}
	
}
