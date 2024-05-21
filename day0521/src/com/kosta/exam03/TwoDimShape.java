package com.kosta.exam03;

public abstract class TwoDimShape extends Shape{

	protected double area;
	
	public TwoDimShape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TwoDimShape(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TwoDimShape [area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	public double getArea() {
		return area;
	}

	public abstract void calcArea();
}
