package com.kosta.exam10;

public class sortArray {
	public static void asc(int []arr) {
		int box=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					box = arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
				}
			}
		}
		System.out.println(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,8,4,2,6};
		asc(arr);
	}

}
