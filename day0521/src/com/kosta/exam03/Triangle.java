package com.kosta.exam03;

public class Triangle extends TwoDimShape {
	private double width;
	private double length;
	

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Triangle(int x, int y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}


	@Override
	public void calcArea() {
		area = (width * length)/2;
	}


	@Override
	public String toString() {
		return "Triangle [width=" + width + ", length=" + length + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}

}
