package com.kosta.LAB2;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setLength(100);
		box1.setHeight(100);
		box1.setWidth(100);
		
		
		System.out.println(box1.getVolume());
		
		System.out.println(box1);
		
		Box box2 = new Box(200,200,200);
		System.out.println(box2);
		box2 = box1;
		
		System.out.println(box2.getHeight());
		System.out.println(box2.getLength());
		System.out.println(box2.getWidth());
		
		
		System.out.println(box1);
		System.out.println(box1);
		//주소값 자체가 덧씌워져서 다른 객체라고 할 수 없다.
		
		Box box3 = new Box(200,200,200);
		box3.setHeight(box1.getHeight());
		System.out.println(box3);
		
		
		

	}

}
