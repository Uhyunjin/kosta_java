package com.kosta.exam;

public class MethodMaxArray {
	public static void maxArray(int []arr) {
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int []array = {5,8,4,1,6,3};
		maxArray(array);
	}
}
