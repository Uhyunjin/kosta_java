package com.kosta.LAB2;

public class Product {
	
	protected String name;
	protected double price;
	
	public double getPrice() {
		return price;
	};

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}
