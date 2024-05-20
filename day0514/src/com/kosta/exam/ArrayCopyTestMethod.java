package com.kosta.exam;

public class ArrayCopyTestMethod {
	
	//정수형 배열을 전달받아서 배열의 요소를 모두 출력하는 메소드를 정의
	public static void printArray(String arrayName, int []arr){
		System.out.println(arrayName);
		for (int data : arr) {
			System.out.printf("%5d",data);
		}		
		System.out.println();
		return;
	}
	
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = new int[a.length];
		
		printArray("a배열의 요소", a);
		printArray("b배열의 요소", b);

		for (int i = 0; i < a.length; i++) {
			//a배열의 원소와 동일한 값을 갖도록
			b[i]=a[i];
		}
		printArray("a배열의 요소", a);
		printArray("b배열의 요소", b);	
	}
}
