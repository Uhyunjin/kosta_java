package com.kosta.exam30;

public class PlaenTest {

	public static void main(String[] args) {
		Plane p1 = new Plane("airbus", "A380", 500);
		Plane p2 = new Plane();
		p2.setProduction("boeing");
		p2.setModel("B787");
		p2.setMaxPax(242);
		
		System.out.println(p1);
		System.out.println(p2);

		System.out.println(Plane.getPlanes());

	}

}
