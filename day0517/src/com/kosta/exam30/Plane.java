package com.kosta.exam30;

public class Plane {
	
	private String production;
	private String model;
	private int maxPax;
	
	public static int planes;
	
	//public static void setPlanes() {
	//	planes += 1;
	//}
	
	public static int getPlanes() {
		return planes;
	}
	
	
	public Plane() {
		planes++;
	}
	public Plane(String production, String model, int maxPax) {
		planes++;
		this.production = production;
		this.model = model;
		this.maxPax = maxPax;
	}
	@Override
	public String toString() {
		return "Plane [production=" + production + ", model=" + model + ", maxPax=" + maxPax + "]";
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxPax() {
		return maxPax;
	}
	public void setMaxPax(int maxPax) {
		this.maxPax = maxPax;
	}
	

}
