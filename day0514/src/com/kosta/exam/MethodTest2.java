package com.kosta.exam;


public class MethodTest2 {
	public static void sayHello(int repeat, String name) {
		
		for (int i = 0; i < repeat; i++) {			
			System.out.println("Hello "+name);
		}
		return; // => 안 써줘도 생략된것으로 판단한다.
	}

	public static void main(String[] args) {
		sayHello(3,"summer");
		
		String title = "KOSTA EDU CENTER";
		System.out.println(title);
		
		sayHello(2,"summer");
		
		int year = 2024;
		System.out.println(year);
		
		sayHello(5,"summer");
		
		sayHello(2, "teacher");

	}

}

