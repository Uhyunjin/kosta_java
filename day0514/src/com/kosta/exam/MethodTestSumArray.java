package com.kosta.exam;

public class MethodTestSumArray {
	//정수형 배열을 매개변수로 전달받아 총 합을 누적하여 출력하는 메서드 정의
	
	public static void printSumArray(int []arr) {
		int sum=0;
		for (int i : arr) {
			sum += i;
		}
		for (int i : arr) {
			System.out.printf("%3d",i);
		}
		System.out.print(" 의 합 : ");
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		int []a = {1,3,5,7,9,10};
		int []b = {11,12,13,14,18};
		printSumArray(a);
		printSumArray(b);
	}
}