package com.kosta.exam08;

public class ShapeTest {

	public static void main(String[] args) {
		Shape r = new Rect(5,8);
		r.calcArea();
		r.calcRound();
		
		Round r2 = new Round(6);
		r2.calcArea();
		r2.calcRound();
		
		System.out.println(r);
		System.out.println(r2);

	}

}
