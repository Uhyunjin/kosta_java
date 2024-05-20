package com.kosta.exam;

public class MethodAddReturn {
	
	public static int getAdd(int a, int b) {
		int add  = a + b;
		return add;
	}

	public static void main(String[] args) {
		
		int result = getAdd(10,22);
		System.out.println(result);
	}

}
