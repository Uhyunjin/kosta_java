package com.kosta.exam08;

public class Round extends Shape{
	private double r;
	private final static double PI = 3.141598;	//상수 final, 대문자

	public Round() {}
	public Round(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public Round(int r) {
		this.r = r;
	}
	@Override
	public void calcArea() {
		area = (r*r)*PI;
	}

	@Override
	public void calcRound() {
		round = 2*r*PI;
	}
	public double getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Round [r=" + r + ", x=" + x + ", y=" + y + ", area=" + area + ", round=" + round + "]";
	}
	
	
}
