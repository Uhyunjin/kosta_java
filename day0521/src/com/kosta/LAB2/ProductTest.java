package com.kosta.LAB2;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("p", 500);
		DiscountProduct p2 = new DiscountProduct("p2", 200, 0.2);
		p2.getPrice();
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
