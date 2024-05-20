package com.kosta.HW;

public class Bird {
	
	private String type;
	private String color;
	private int size;
	
	public static int number;
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Bird [type=" + type + ", color=" + color + ", size=" + size + "]";
	}

	public Bird(String type, String color, int size) {
		number ++;
		this.type = type;
		this.color = color;
		this.size = size;
	}

	public Bird() {
		number++;
	}

	
	
	

}
