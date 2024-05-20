package com.kosta.exam23;

class Dice{
	private int face;
	
	public void roll() {
		face= (int)(Math.random()*6)+1;
		System.out.println(face);
	}
	public int getFace() {
		return face;
	}
}

public class RandomTest {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.roll();
		d2.roll();
		
		System.out.println("첫번째 주사위의 면 : "+d1.getFace());
		System.out.println("두번째 주사위의 면 : "+d2.getFace());
	}
}
