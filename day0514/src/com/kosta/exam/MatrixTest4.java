package com.kosta.exam;

public class MatrixTest4 {
	public static void printMatrix(int [][]arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%d] : ", i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%3d]", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		
		int [][]b = {{10,20,30},
					 {40,50,60},
					 {70,80,90},
					 {100,110,120}};
		
		int [][]c = {{1,2,3,4,5},
					 {6,7},
					 {8,9,10},
					};

		printMatrix(b);
		printMatrix(c);
	}
}
