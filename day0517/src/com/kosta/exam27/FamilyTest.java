package com.kosta.exam27;

public class FamilyTest {
	public static void main(String[] args) {
		Family.addr = "서울시 종로구 관철동";
		System.out.println(Family.addr);
		
		Family f1 = new Family("summer", 29);
		Family f2 = new Family("winter", 33);
		
		System.out.println(f1.getName()+", "+f1.addr);
		System.out.println(f2.getName()+", "+f2.addr);
		
		f1.addr = "제주도 서귀포시";
		
		System.out.println(f1.getName()+", "+f1.addr);
		System.out.println(f2.getName()+", "+f2.addr);
		
		Family.pro();
		f1.pro();
	}
}
