package com.kosta.exam09;

public class ShapeTest {

	public static void main(String[] args) {
//		Round []data1 = new Round[3];
//		Rect []data2 = new Rect[3];
		Shape []data3 = new Shape[3];
		data3[0] = new Round(3,3,3);
		data3[1] = new Rect(10,200,100,100);
		data3[2] = new Round(10,310,25);
		
		for (Shape s : data3) {
			s.calcArea();
			s.calcRound();
			System.out.println(s);
		}
	}

}
