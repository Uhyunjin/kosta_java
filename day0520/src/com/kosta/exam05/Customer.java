package com.kosta.exam05;

public class Customer extends Person {
	private String no;
	private String mileage;
	
	
	@Override
	public String toString() {
		return "Customer [no=" + no + ", mileage=" + mileage + ", name=" + name + ", addr=" + addr + ", phone=" + phone
				+ "]";
	}
	
//	@Override
//	public String toString() {
//		return "Customer [no=" + no + ", mileage=" + mileage + ", name=" + name + ", addr=" + addr + ", phone=" + phone
//				+ "]";
//	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String addr, String phone) {
		super(name, addr, phone);
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String addr, String phone, String no, String mileage) {
		super(name, addr, phone);
		this.no = no;
		this.mileage = mileage;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}	
}
