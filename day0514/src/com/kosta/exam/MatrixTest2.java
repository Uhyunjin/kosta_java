package com.kosta.exam;

public class MatrixTest2 {

	public static void main(String[] args) {
		int [][]a = new int[3][];
		
		a[0] = new int[5];
		a[1] = new int[2];
		a[2] = new int[8];
		
		int n = 1;
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : ", i);
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = n;
				System.out.printf("[%2d]",a[i][j]);
				n++;
			}
			System.out.println();
		}
		
		for (int[] arr : a) {
			for (int i : arr) {
				System.out.printf("[%2d]",i);
			}
			System.out.println();
		}
	}
}
