package com.kosta.exam03;

public class Cylinder extends ThreeDimShape {
	private double height;
	private double radius;
	public final static double PI = 3.141592;

	public Cylinder(int x, int y, double height, double radius) {
		super(x, y);
		this.height = height;
		this.radius = radius;
	}

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + ", volume=" + volume + ", x=" + x + ", y=" + y
				+ "]";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calcVolume() {
		volume = Cylinder.PI*(radius*radius)*height;
		//여기 cylinder는 머징
	}

}
