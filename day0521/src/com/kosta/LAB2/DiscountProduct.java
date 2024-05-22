package com.kosta.LAB2;

public class DiscountProduct extends Product {
	
	private double discount;
	
	public double getPrice() {
		price = price * (1-discount);
		return price;
	}

	@Override
	public String toString() {
		return "DiscountProduct [discount=" + discount + ", name=" + name + ", price=" + price + "]";
	}

	public DiscountProduct(String name, double price, double discount) {
		super(name, price);
		this.discount = discount;
	};
	
}
