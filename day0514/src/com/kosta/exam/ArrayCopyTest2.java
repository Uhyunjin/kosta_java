package com.kosta.exam;

public class ArrayCopyTest2 {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			//a배열의 원소와 동일한 값을 갖도록
			b[i]=a[i];
		}
	}

}
