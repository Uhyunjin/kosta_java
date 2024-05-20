package com.kosta.exam;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		
		for (int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		
		System.out.println("a의 메모리 주소 : "+a);
		System.out.println("b의 메모리 주소 : "+b);
		
		for (int i : b) {
			System.out.println(i);
		}
	}

}
