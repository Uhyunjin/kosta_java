package com.kosta.exam;


//두 개의 배열의 원소가 모두 동일한지 판별하는 프로그램을 작성해봅니다.
public class PrimitiveTypeAndArray {

	public static void main(String[] args) {

		int []data1 = {10,20,30,40,50};
		int []data2 = {10,20,30,40,60};

		if (data1.length==data2.length) {
			for (int i=0;i<data1.length;i++) {
				if (data1[i]!=data2[i]) {
					System.out.println("배열이 달라요");
					break;
				}
			}
			
		} else {
			System.out.println("배열의 길이가 달라요");
		}
		System.out.println("배열이 같아요");
	}
}
